# Drop down


> ## Spinner
> 선택 상자를 출력한 후에 상자를 선택하면 아래쪽으로 목록이 나타나도록 하는 기능을 말한다.
안드로이드에서는 목록을 나타나게 할 때 "Adapter"라는 객체를 이용합니다. 이것은 행 레이아웃과 여기에 매핑할 데이터를 정의하는 기능을 합니다.
prompt를 사용하면 화면에 뜨게 된다.


>**simple _ spinner _ item** 은 레이아웃을 플랫폼에서 제공하는데 스피너의 모양에 대해 자체적인 레이아웃을 직접정의하지 않을때 사용해야하는 기본 레이아웃입니다.


>**setDropdownViewResource**는 어댑터가 스피너 선택항목의 목록을 표시하는데 사용해야하는 레이아웃을 지정한 것 입니다.


## ListView
>ListView는 사용자가 정의한 데이터 목록을 아이템 단위로 구성하여 화면에 출력하는 ViewGroup의 한 종류입니다. ListView의 아이템들은 세로 방향으로 나열되며, 아이템의 개수가 많아짐에 따라 ListView에 표시될 내용이 ListView의 크기(width,height)를 넘어서게 되면 스크롤 기능을 사용해 ListView의 표시 기준 위치를 이동시킬 수 있습니다.


>ListView는 UI(User Interface)를 구성함에 있어 가장 많이 사용되는 컴포넌트 중 하나이며 안드로이드 시스템의 연락처, 환경설정 등이 ListView의 대표적인 예입니다.

### Adapter란?
>listview에 데이터를 추가하여 화면에 표시하기 위해서는 adapter를 사용합니다. 어댑터란,, 장치 또는 기계의 다른 부분을 연결하는 장치라 볼 수 있습니다. 즉,, 사용자가 정의한 데이터를 ListView에 출력하기 위해 사용하는 객체로, 사용자 데이터와 화면 출력 view로 이루어진 두 개의 부분을 이어주는 객체라 볼 수 있습니다.
![apapter](https://cdn-images-1.medium.com/max/1600/1*jm0tA6ShYwoCNKY2Pa1S0w.png)

## **Adapter 쓰이는 세가지 ㅎ**
>
>ArrayAdapter (배열로부터 데이터 가져올 때 사용)
>
>CursorAdapter (DB로부터 가져올 때)
>
>SimpleAdapter(XML 등으로부터 가져올 때)를 구분하여 사용합니다.

## 리스트 뷰의 단점
> 1. ViewHolder 지원이 되지 않아 퍼포먼스 관리가 어렵다.
> 2. ListView 화면을 유연하게 바꿀수 없다.
> 3. Animation 적용이 어렵다.

> **을 recyclerview는 가능하다**
> 
   그리고,, 
  
> 1. LayoutManager
> 2. ViewHolder
> 3. Item 
> 4. Animation

>가 추가되어 따로 관리 할 수 있어욤ㅎㅎ
>

## RecyclerView
>RecyclerView 위젯은 ListView의 더욱 향상되고 유연해진 버전입니다. 이 위젯은 한정된 수의 뷰를 유지함으로써 매우 효율적으로 스크롤할 수 있는 큰 데이터 집합을 표시하기 위한 컨테이너입니다.

>RecyclerView 위젯은 ListView의 더욱 향상되고 유연해진 버전입니다. 이 위젯은 화면에 표시할 만한 갯수의 리스트 아이템을 만들고 이 갯수를 유지함과 동시에 스크롤의 이벤트에 따라 올리면 상단 뷰가 다시 하단으로 이동하여 안의 컨텐츠만 바뀌고 재사용 되도록 설계된 위젯 입니다.
>
예시)
![리사이클러뷰](http://cfile29.uf.tistory.com/image/99ABAE3359EB3FE21716D5)

> **리사이클러 뷰의 유연성이 있는데 다음의 3가지 인터페이스를 구현해야합니다.**
> 
**onCreateViewHolder(ViewGroup parent, int viewType)**  : 뷰 홀더를 생성하고 뷰를 붙여주는 부분입니다.

> **onBindViewHolder(ListItemViewHolder holder, int position)** : 재활용 되는 뷰가 호출하여 실행되는 메소드, 뷰 홀더를 전달하고 어댑터는 position 의 데이터를 결합시킵니다.

> **getItemCount( )** : 데이터의 개수 반환

**ViewHolder를 쓰는 이유?!**
> UI 를 수정할 때 마다 부르는 findViewById( ) 를 뷰홀더 패턴을 이용해 한번만 함으로서 리스트 뷰의 지연을 초래하는 무거운 연산을 줄여준다.

 


### **리사이클러뷰**
> 는 크게 Adapter클래스, LayoutManager클래스,데이터로 이루어져 있습니다. 데이터는 우리가 리스트로 나타내고 싶은 데이터를 지칭하고 레이아웃 매니저는 데이터를 세로로 스크롤형태로 뿌려줄 것인지,가로 스크롤 형태로 뿌려줄것인지, 그리드 형태로 뿌려줄 것인지를 결정하는 클래스 입니다.
>![리사이클러뷰예](http://img1.daumcdn.net/thumb/R1920x0/?fname=http%3A%2F%2Fcfile24.uf.tistory.com%2Fimage%2F99180A3359EB7AE11E7972)
>
>## 여기서 잠깐,,, (리스트뷰와 리사이클러뷰의 차이?!)
>리스트 뷰는 수직 스크롤만 가능합니다. 리스트뷰를 수평으로 사용할 수는 없었죠. 그것을 구현하기 위한 방법이 몇가지 있다는 것을 알고는 있지만 리스트 뷰는 그렇게 동작하도록 디자인 되지 않았습니다. 그러나 이제 리사이클러뷰에서는 수평 스크롤 또한 지원합니다. 뿐만 아니라 더 다양한 타입의 리스트들을 지원하고, 커스텀 할 수 있도록 해줍니다. 

## layout Manager
> LinearLayoutManager : 리사이클러 뷰에서 가장 많이 쓰이는 레이아웃으로 수평, 수직 스크롤을 제공하는 리스트를 만들 수 있습니다.

> StaggeredGridLayouManager : 이 레이아웃을 통해 뷰마다 크기가 다른 레이아웃을 만들 수 있습니다.

> GridLayoutManager : 여러분의 사진첩 같은 격자형 리스트를 만들 수 있습니다.


