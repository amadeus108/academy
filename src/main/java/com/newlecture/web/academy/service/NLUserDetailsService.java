package com.newlecture.web.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.academy.dao.MemberDao;
import com.newlecture.web.academy.dao.MemberRoleDao;
import com.newlecture.web.academy.entity.Member;
import com.newlecture.web.academy.entity.MemberRole;

@Service
public class NLUserDetailsService implements UserDetailsService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private MemberRoleDao memberRoleDao;

	@Override
	public UserDetails loadUserByUsername(String username) {
		Member member = memberDao.get(username);
		List<MemberRole> memberRoles = memberRoleDao.getListByMemberId(username);
		
		UserBuilder builder = null;
		
		String[] authorities = memberRoles
								.stream()
								.map(mr->mr.getRoleName()) //람다식 사용.
								.toArray(String[]::new);
								//LINQ -> Language Include Query; 언어에 컬렉션을 사용하면서 컬렉션을 가져오기 위한 쿼리가 포함됨
		
		builder = User.withUsername(username);
		builder.password(member.getPwd());
		builder.authorities(authorities); //격자형 배열에서 한열만 빼온다
		
		return builder.build();
	}

}
