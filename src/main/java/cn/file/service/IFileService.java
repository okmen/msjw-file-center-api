 package cn.file.service;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import cn.file.bean.vo.ProblemFeedbackVo;
import cn.sdk.bean.StVo;

 
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
	public String uploadFile(String localFile,Integer days) throws Exception;
	
 	/**
	 * @Title: uploadFile 
	 * @Description: TODO(通过File上传文件) 
	 * @param @param file
	 * @param @return
	 * @param @throws Exception 设定文件 
	 * @return boolean 返回类型 
	 * @throws
 	 */
	public String uploadFile(File file,Integer days) throws Exception;
 	
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
    /**O
     * 写图片到服务器
     * @param reportSerialNumber
     * @param base64Img
     * @return
     * @throws Exception
     */
    public String uploadAdminWeb(FileInputStream fileInputStream,String pf)throws Exception;
    
    /**O
     * 写图片到225服务器
     * @param reportSerialNumber
     * @param base64Img
     * @return
     * @throws Exception
     */
    public List<String> writeImgReadilyShoot(String reportSerialNumber,List<StVo> base64Imgs)throws Exception;
    /**
     * 压缩历史随手拍图片
     * @throws Exception
     */
    public void gziImgOld()throws Exception;
    
    /**
     * 写图片到服务器
     * @param file
     * @param pf
     * @return
     * @throws Exception
     */
    public String uploadFile(InputStream inputStream,String pf)throws Exception;
    
    /**
     * 二进制流写入到图片服务器
     * @param input
     * @param pf
     * @return
     * @throws Exception
     */
    public String uploadFileImg(String base64Str, String pf)throws Exception;
    /**

     * 反馈图片存储获取
     * @param reportSerialNumber
     * @param base64Imgs
     * @return
     * @throws Exception
     */
	List<String> problemFeedback(String reportSerialNumber, List<StVo> base64Imgs) throws Exception;
    /**
     * 问题反馈
     * @param problemFeedbackVo
     * @return
     */
	public int saveProblemFeedback(ProblemFeedbackVo problemFeedbackVo);
 }
