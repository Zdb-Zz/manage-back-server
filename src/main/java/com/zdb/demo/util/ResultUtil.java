package com.zdb.demo.util;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回值工具包
 * 
 * @author 顾继钞
 * @date 2018年8月16日 上午9:44:25
 */
public class ResultUtil {

	private static final String CODE = "code";
	private static final String DATA = "data";
	private static final String MESSAGE = "message";
	
	private static final String MESSAGE_DEFAULT_SUCCESS = "success";
	private static final String MESSAGE_DEFAULT_FAIL = "fail";

	/**
	 * 列表返回值
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:45:03
	 * @param partList
	 *            分页后的列表
	 * @param pageIndex
	 *            当前页面
	 * @param pageSize
	 *            页面大小
	 * @param total
	 *            总条数
	 * @return
	 */
	public static Map<String, Object> listResult(Integer pageIndex, Integer pageSize, Integer total, Object partList) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Integer pages = total / pageSize + 1;
		if (total % pageSize == 0) {
			pages = total / pageSize;
		}
		map.put("pageIndex", pageIndex);
		map.put("pageSize", pageSize);
		map.put("pages", pages);
		map.put("total", total);
		map.put("partList", partList);
		dataMap.put("code", 1);
		dataMap.put("data", map);
		dataMap.put("message", "获取成功");
		return dataMap;
	}

	/**
	 * 成功返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:20
	 * @param status
	 *            状态码(暂无用)
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static Map<String, Object> resultSuccess(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 1);
		map.put("message", "success");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 失败返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:53
	 * @param status
	 *            状态码(暂无用)
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static Map<String, Object> resultFail(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 3);
		map.put("message", "fail");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 参数错误
	 * 
	 * @author 顾继钞
	 * @date 2018年9月26日 上午9:24:08
	 * @param message
	 * @param status
	 * @param data
	 * @return
	 */
	public static Map<String, Object> paramFail(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("message", "参数错误");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 登陆认证失败
	 * 
	 * @author 顾继钞
	 * @date 2018年9月14日 上午11:51:30
	 * @param message
	 * @param status
	 * @param data
	 * @return
	 */
	public static Map<String, Object> resultFailLogin(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 2);
		map.put("message", "请重新登陆");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 列表返回值
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:45:03
	 * @param partList
	 *            分页后的列表
	 * @param pageIndex
	 *            当前页面
	 * @param pageSize
	 *            页面大小
	 * @param total
	 *            总条数
	 * @return
	 */
	public static JSONObject listResultJson(Integer pageIndex, Integer pageSize, Integer total, Object partList) {
		JSONObject dataJson = new JSONObject();
		JSONObject rJson = new JSONObject();
		Integer pages = total / pageSize + 1;
		if (total % pageSize == 0) {
			pages = total / pageSize;
		}
		dataJson.put("pageIndex", pageIndex);
		dataJson.put("pageSize", pageSize);
		dataJson.put("pages", pages);
		dataJson.put("total", total);
		dataJson.put("partList", partList);
		rJson.put("code", 1);
		rJson.put("data", dataJson);
		rJson.put("message", "获取成功");
		return rJson;
	}

	/**
	 * 成功返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:20
	 * @param status
	 *            状态码(暂无用)
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static JSONObject resultSuccessJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code", 1);
		rJson.put("message", "success");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

	/**
	 * 失败返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:53
	 * @param status
	 *            状态码(暂无用)
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static JSONObject resultFailJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code", 3);
		rJson.put("message", "fail");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

	/**
	 * 参数错误
	 * 
	 * @author 顾继钞
	 * @date 2018年9月26日 上午9:24:08
	 * @param message
	 * @param status
	 * @param data
	 * @return
	 */
	public static JSONObject paramFailJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code", 0);
		rJson.put("message", "参数错误");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

	/**
	 * 登陆认证失败
	 * 
	 * @author 顾继钞
	 * @date 2018年9月14日 上午11:51:30
	 * @param message
	 * @param status
	 * @param data
	 * @return
	 */
	public static JSONObject resultFailLoginJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code", 2);
		rJson.put("message", "请重新登陆");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}
	
	/**
	 * 返回值
	 * @author 顾继钞
	 * @date 2018年11月26日 下午2:05:49
	 * @param code 返回状态
	 * @param message 返回提醒
	 * @param data 返回数据
	 * @return
	 */
	public static ResultDataBuilder resultObject(Integer code,String message,Object data) {
		ResultDataBuilder resultDataBuilder = new ResultDataBuilder();
		resultDataBuilder.build(code, message, data);
		return resultDataBuilder;
	}
	
	/**
	 * 返回值
	 * @author 顾继钞
	 * @date 2018年11月26日 下午2:22:35
	 * @param code 返回状态
	 * @param message 返回提醒
	 * @return
	 */
	public static ResultDataBuilder resultObject(Integer code,String message) {
		ResultDataBuilder resultDataBuilder = new ResultDataBuilder();
		resultDataBuilder.build(code, message);
		return resultDataBuilder;
	}
	
	/**
	 * 返回值
	 * @author 顾继钞
	 * @date 2018年11月26日 下午2:46:02
	* @param code 返回状态
	 * @return
	 */
	public static ResultDataBuilder resultObject(Integer code) {
		ResultDataBuilder resultDataBuilder = new ResultDataBuilder();
		resultDataBuilder.build(code);
		return resultDataBuilder;
	}
	
	public static class ResultDataBuilder {
		private Map<String, Object> response;

		private Map<String, Object> data;

		private ResultDataBuilder() {
			this.response = new HashMap<>();
		}

		/**
		 * 创建
		 *
		 * @return
		 */
		public ResultDataBuilder build(Integer code,String message,Object data) {
			response.put(CODE, code);
			response.put(MESSAGE, message);
			response.put(DATA, data);
			return this;
		}
		
		public ResultDataBuilder build(Integer code,String message) {
			response.put(CODE, code);
			response.put(MESSAGE, message);
			return this;
		}
		
		public ResultDataBuilder build(Integer code) {
			response.put(CODE, code);
			return this;
		}
		
		/**
		 * 完成构建
		 * @author 顾继钞
		 * @date 2018年11月26日 下午2:29:11
		 * @return
		 */
		public Map<String, Object> end() {
			if (this.response.get(MESSAGE) == null) {
				if ((Integer)this.response.get(CODE) == 1){ //成功
					this.response.put(MESSAGE, MESSAGE_DEFAULT_SUCCESS);
				}else {
					this.response.put(MESSAGE, MESSAGE_DEFAULT_FAIL);
				}
			}
			if (this.data != null && this.response.get(DATA) == null) {
				this.response.put(DATA, this.data);
			}
			return this.response;
		}

		/**
		 * 放入参数
		 *
		 * @param key
		 * @param value
		 * @return
		 */
		public ResultDataBuilder appendDataToData(String key, Object value) {
			this.data = new HashMap<>();
			this.data.put(key, value);
			return this;
		}
		
		/**
		 * 放入参数
		 * @author 顾继钞
		 * @date 2018年12月27日 下午4:27:08
		 * @param key
		 * @param value
		 * @return
		 */
		public ResultDataBuilder appendDataToOut(String key, Object value) {
			this.response.put(key, value);
			return this;
		}
	}
}
