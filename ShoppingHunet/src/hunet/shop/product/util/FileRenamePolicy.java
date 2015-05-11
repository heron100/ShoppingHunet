package hunet.shop.product.util;

public class FileRenamePolicy {
  
	  public String rename(String originName, int seqId) { 
		  String body = null;
		  String ext = null;
		  
		  int dot = originName.lastIndexOf(".");
		  
		  //확장자가 있을때
		  if (dot != -1) { 
			  body = seqId+"";
			  ext = originName.substring(dot);
		  //확장자가 없을때
		  } else {  
			  body = seqId+"";
			  ext = "";
		  }
	
		  String newName = body + ext;
		  return newName;
	  }
	
}
