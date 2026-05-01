package bakery_p;

import java.util.List;
import java.util.Map;

import basic_p.MenuDTO;

public class MenuListService {

	Map<String,List<MenuDTO>> menuData ;
	
	public MenuListService() {
		menuData = Map.of(
				"회사소개", 
				List.of(
						new MenuDTO("/jspPrj/forward/info/hello.jsp","인사말"),
						new MenuDTO("/jspPrj/forward/info/history.jsp","연혁"),
						new MenuDTO("/jspPrj/forward/info/location.jsp","오시는길")

						),
				"일반빵",
				List.of(
						new MenuDTO("/jspPrj/forward/basic/Bagette","바게뜨"),
						new MenuDTO("/jspPrj/forward/basic/RedBean","앙꼬"),
						new MenuDTO("/jspPrj/forward/basic/Soboro","소보로")
						),
				"케이크",
				List.of(
						new MenuDTO("cheeze","치즈"),
						new MenuDTO("icing","생크림"),
						new MenuDTO("strawberry","딸기"),
						new MenuDTO("sp","고구마")
						)
				);
	}
	
	public List<MenuDTO> menuList(String cate){
		return menuData.get(cate);
	}
	
	
	
}
