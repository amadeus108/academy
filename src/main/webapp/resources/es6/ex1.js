// var x = 3;
// var x = 5;

// console.log(x);

// let y = 3;
// let y = 5;

// console.log(y);

//function getValue(condition){
//    if(condition){
//        let value = "blue";
//        return value;
//    }else{
//        return value;
//    }
//    console.log(value);
//}
	
//if(true){
//    console.log(x);
//    let x = 3;
//}

//for(var i = 0; i<10; i++){
//	
//}
//console.log(i);
//
//for(let j = 0; j<10; j++){
//	
//}
//console.log(j);

var a = 3;
console.log(a);
console.log(window.a); //브라우저인 경우, var a 로 선언하지 않으면 global 객체에 담긴다.
console.log(window.a === a);

let b = 5;
console.log(b);
console.log(window.b);
console.log(window.b === b);

window.addEventListener("load", function(){
    var z = 4;
    console.log(z);
    console.log(window.z);
    console.log(window.z === z);
})

//var text = '길';
//console.log(text.length);

var text = '𠮷'; //32비트
var text2 = '길'; //16비트
var pattern = "/^.$/.test(text)";
var y = "hello@naver.com";

//패턴 비교
console.log(/^.$/.test(text)); //false
console.log(/^.$/.test(text2)); //true
//정규식에 u Flag가 새로 생김
console.log(/^.$/u.test(text));

//자바스크립트는 기본 16비트를 이용, 한자는 갯수가 많아 16비트 한문자로 표현불가.  

var text3 = "동해물과 백두산이\
            마르고......";
var text4 = "동해물과 백두산이 " +
		"마르고 닳....";
var text5 = `동해물과 백두산이 
마르고...`;	//키보드 1번 옆, ``(grave) 사용
console.log(text3.length);
console.log(text4);
console.log(text5.length);

var name = "서해물";
var text6 = `${name} 과 백두산이`;
console.log(text6);

//ex1.html에서 사용할 메뉴 컨트롤러(ng-controller에 입력)를 여기에 작성
//module은 분리된 형태로 있어야 함(다른 js에도 같은 이름이 있을 수 있으니까), 따로 module을 선언해야함
//이렇게 module을 만들어주면 완전히 독립된 형태가 된다.
var menuModule = angular.module("menu-app", []);
//angular.module("이 모듈을 사용할 앱을 지정", [이 앱에서 사용하는 다양한 디펜던시를 입력하고 없으면 빈 배열])

menuModule.controller("menu-controller", function($scope){	/*$scope는 예약된 기호, Model model을 인자로 담아주는것과 같은 기능*/
	$scope.title = "Hello angular";
});



