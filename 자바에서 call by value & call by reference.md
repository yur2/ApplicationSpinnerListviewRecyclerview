# 자바에서 call by value & call by reference

> 자바에선 C 언어와 같은 포인터는 존재하지 않는다. 즉, 직접 메모리에 접근하는 것은 불가해요. 그러나, 동작 자체는 C 의 포인터와 유사하게 동작하는 변수들이 있는데, 이를 reference 변수가 하며,  대표적으로 배열(array) 와 클래스 (class) 들이 있지요~

>**자바에서 메소드 호출시 기본형(primitive type)을 넘겨주면 Call by Value 이며,  reference 변수를 메소드로 주고 받을때는 Call by Reference가 발생합니다.**
>
> ### 예를 들어 ,, swap함수를 시행 할때!
> 
> 
> 1) call by value
> swap함수에 아규먼트가 전달될때, (x,y)값을 복사해서 값만 넘기기 때문에 swap함수를 사용해도 서로 바뀌지않는다!!
> 
> 2) call by reference
>  swap함수에 저장된 x,y 자체를 넘겼기때문에 서로 바뀌게 나올 수 있다!!!



# Glide 사용법
> 사진저장없이 인터넷에서 바로 넣을 수 있는 방법이당!!
> ## Glide를 추가할 시 ,,
> **complie 'com.github.bumptech.glide:glide:3.6.0'**
> ## Glide 사용법
> **glide.with(this).load("이미지 주소").into(imageview);**