package constants;

import java.io.File;

public class Constants 
{
	public static final String CONFIGFILE=System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"config.properties";
	public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx";
	public static final String TESTDATAFILEIMAGEMANAGEPAGEADD = System.getProperty("user.dir")+"\\src\\test\\resources\\butterfly.jpg";
	public static final String LOGIN_PAGE="Login";
	public static final String ADD_USER_IN_ADMIN_USER_DATA = "AdminUsersAdd";
	public static final String SUB_CATEGORY_DATA_PAGE="AddInSubCategoryData";
	public static final String NEWS_DATA="AddNewsData";
	public static final String ADMIN_USER_SEARCH_DATA="AdminUserSearchData";
	public static final String MANAGE_CONTACTS_DATA="ManageContactsData";
	public static final String MANAGE_PAGES_NEW_DATA="ManagePagesNewData";
	public static final String MANAGE_PAGES_SEARCH_AND_DELETE_DATA="ManagePagesSearchAndDeleteData";
	public static final String UPDATE_IN_MANAGE_CATEGORY_DATA="UpdateInManageCategoryData";
	public static final String TESTDATA_FILEIMAGE_UPDATEIN_MANAGECATEGORY = null;
	public static final String TESTDATA_IMAGE_FOR_MANAGE_PAGE = System.getProperty("user.dir")+"\\src\\test\\resources\\butterfly.jpg";
}

