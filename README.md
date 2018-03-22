# Drop down


 ## Spinner
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
> 
> ##layoutInflater
> XML에 정의된 Resource(자원) 들을 View의 형태로 반환해 줍니다. 보통 자바 코드에서 View, ViewGroup 을 사용하거나, Adpter의 getview() 또는 Dialog, Popup 구현시 배경화면이 될 Layout을 만들어 놓고 View의 형태로 반환 받아 Acitivity에서 실행 하게 됩니다.
우리가 보통 Activity를 만들면 onCreate() 메서드에 기본으로 추가되는 setContentView(R.layout.activity_main) 메서드와 같은 원리라고 생각하면 된다. 이 메서드 또한 activity_main.xml 파일을 View로 만들어서 Activity 위에 보여준다. 사용자의 화면에 보여지는 것들은 Activity 위에 있는 View라는 점 잊지말깅~!

>즉 간단히 말해서
>
>**1. 안드로이드에서 레이아웃 XML파일을 View객체로 만들기 위해서는 LayoutInflater를 이용한다.**
>
>**2. XML레이아웃 파일에서 뷰를 생성할때는 LayoutInflater를 이용해야 한다.**
>
>**3. LayoutInflater는 LayoutInflater.from(context)를 이용하여 얻을 수 있다.**
>
>**4. LayoutInflater객체의 inflate메서드를 이용하여 새로운 뷰를 생성 할 수 있다.**

## custom adpater 할 때,,
public myCustomAdapter(Context context, int layout, ArrayList<Item> alist) 일때,,

– context : 현재의 Context. 일반적으로 Adapter를 포함하는Activity의 instance가 들어간다.

– layout : 각 항목을 나타내는 layout 파일의 resource ID. 예를 들어, 아까 만든 item_layout.xml 이 이 자리에 들어가게 된다.

– alist : ListView에 나타낼 리스트 객체

## 새로운 어댑터를 생성시, 자동완성으로 함수가 뜨는데 이런 의미다 아래에 자세한 설명 있음!!
class Myadapter extends BaseAdapter {


– int getCount() : 리스트 객체 내의 item의 갯수를 반환해주는 함수. 리스트 객체의 size를 반환해주면된다

– Object getItem() : 전달받은 position의 위치에 해당하는 리스트 객체의 item를 객체 형태로 반환해주는 함수.

– long getItemId() : 전달받은 position의 위치에 해당하는 리스트 객체의 item의 row ID를 반환해주는 함수.

-View getView() 함수가 가장 중요한 데, 간단히 말해서 화면에 보여지는 각각의 ListView의 항목들을 출력하는 함수이다. 예를 들어 화면에 나타나는 ListView의 항목이 5개라면, getView() 함수가 5번 호출된다.

## View getView() 설명@-@ 중요해욤ㅎㅎ

public abstract View getView (int position, View convertView, ViewGroup parent)

– position : 해당되는 항목의 Adapter에서의 위치값

– convertView : 재사용할 항목의 View

– parent : 항목의 View들을 포함하고 있는 ListView

convertView에서 갑자기 재사용(?) 이라는 말에 물음표가 생길 것이다. 간단하게 얘기하면, 만약 리스트 객체에 100개의 데이터가 있고, 10개의 항목만을 보여주는 ListView가 있다고 하자. 처음에는 가장 앞의 10개의 데이터가 화면에 나타나고, 스크롤할 때마다 화면에 나타나지 않았던 데이터가 하나씩 나타날 것이다. 하지만 그 때마다 똑같은 형식의 새로운 View를 만들어준다면 이것은 너무 resource 측면에서 비효율적일 것이다. 그래서 화면에서 없어진 View를 일단 convertView 변수에 넣고. 새로 나타나는 View는 converView에서 꺼낸 View를 다시 재사용함으로써 이를 해결한다.



