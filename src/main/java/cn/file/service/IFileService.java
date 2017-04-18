 package cn.file.service;
 
import java.io.File;
 
 /**
 * @ClassName: IFileService 
 * @Description: TODO(文件处理接口) 
 * @author yangzan 
 * @date 2017年4月17日 下午1:43:06 
 *
  */
 public interface IFileService {
 	
 	
 	/**
	 * @Title: uploadFile 
	 * @Description: TODO(通过文件路径上传文件) 
	 * @param @param localFile
	 * @param @return
	 * @param @throws Exception 设定文件 
	 * @return boolean 返回类型 
	 * @throws
 	 */
	public String uploadFile(String localFile) throws Exception;
	
 	/**
	 * @Title: uploadFile 
	 * @Description: TODO(通过File上传文件) 
	 * @param @param file
	 * @param @return
	 * @param @throws Exception 设定文件 
	 * @return boolean 返回类型 
	 * @throws
 	 */
	public String uploadFile(File file) throws Exception;
 	
 	/**
	 * @Title: getQiniuImgDomain 
	 * @Description: TODO(获取七牛图片域名) 
	 * @param @return 设定文件 
	 * @return String 返回类型 
	 * @throws
 	 */
    public String getQiniuImgDomain();
    
    /**
     * @Title: getUpToken 
     * @Description: TODO(获取上传凭证) 
     * @param @return 设定文件 
     * @return String 返回类型 
     * @throws
     */
    public String getUpToken();
     
 }
