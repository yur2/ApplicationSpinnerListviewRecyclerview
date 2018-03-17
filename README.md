#Drop down


> ##Spinner
선택 상자를 출력한 후에 상자를 선택하면 아래쪽으로 목록이 나타나도록 하는 기능을 말한다.
안드로이드에서는 목록을 나타나게 할 때 "Adapter"라는 객체를 이용합니다. 이것은 행 레이아웃과 여기에 매핑할 데이터를 정의하는 기능을 합니다.
prompt를 사용하면 화면에 뜨게 된다.


>simple_spinner_item 은 레이아웃을 플랫폼에서 제공하는데 스피너의 모양에 대해 자체적인 레이아웃을 직접정의하지 않을때 사용해야하는 기본 레이아웃입니다.


>setDropdownViewResource는 어댑터가 스피너 선택항목의 목록을 표시하는데 사용해야하는 레이아웃을 지정한 것 입니다.


>##ListView
ListView는 사용자가 정의한 데이터 목록을 아이템 단위로 구성하여 화면에 출력하는 ViewGroup의 한 종류입니다. ListView의 아이템들은 세로 방향으로 나열되며, 아이템의 개수가 많아짐에 따라 ListView에 표시될 내용이 ListView의 크기(width,height)를 넘어서게 되면 스크롤 기능을 사용해 ListView의 표시 기준 위치를 이동시킬 수 있습니다.


>ListView는 UI(User Interface)를 구성함에 있어 가장 많이 사용되는 컴포넌트 중 하나이며 안드로이드 시스템의 연락처, 환경설정 등이 ListView의 대표적인 예입니다.

###Adapter란?
>listview에 데이터를 추가하여 화면에 표시하기 위해서는 adapter를 사용합니다. 어댑터란,, 장치 또는 기계의 다른 부분을 연결하는 장치라 볼 수 있습니다. 즉,, 사용자가 정의한 데이터를 ListView에 출력하기 위해 사용하는 객체로, 사용자 데이터와 화면 출력 view로 이루어진 두 개의 부분을 이어주는 객체라 볼 수 있습니다.
![apapter](https://cdn-images-1.medium.com/max/1600/1*jm0tA6ShYwoCNKY2Pa1S0w.png)

##RecyclerView
>RecyclerView 위젯은 ListView의 더욱 향상되고 유연해진 버전입니다. 이 위젯은 한정된 수의 뷰를 유지함으로써 매우 효율적으로 스크롤할 수 있는 큰 데이터 집합을 표시하기 위한 컨테이너입니다.

>RecyclerView 위젯은 ListView의 더욱 향상되고 유연해진 버전입니다. 이 위젯은 화면에 표시할 만한 갯수의 리스트 아이템을 만들고 이 갯수를 유지함과 동시에 스크롤의 이벤트에 따라 올리면 상단 뷰가 다시 하단으로 이동하여 안의 컨텐츠만 바뀌고 재사용 되도록 설계된 위젯 입니다.
>
예시)
![리사이클러뷰](http://cfile29.uf.tistory.com/image/99ABAE3359EB3FE21716D5)


>**리사이클러뷰**는 크게 Adapter클래스, LayoutManager클래스,데이터로 이루어져 있습니다. 데이터는 우리가 리스트로 나타내고 싶은 데이터를 지칭하고 레이아웃 매니저는 데이터를 세로로 스크롤형태로 뿌려줄 것인지,가로 스크롤 형태로 뿌려줄것인지, 그리드 형태로 뿌려줄 것인지를 결정하는 클래스 입니다.
>![리사이클러뷰예](http://img1.daumcdn.net/thumb/R1920x0/?fname=http%3A%2F%2Fcfile24.uf.tistory.com%2Fimage%2F99180A3359EB7AE11E7972)
# ApplicationSpinnerListviewRecyclerview
