# ch02 
详细讲@RequestMapping这个注解的用法还有Controller处理器的方法到底该怎么写
## 1.@RequestMapping放在类的上面
value: 所有请求地址的公共部分，叫做模块名称
## 2.@RequestMapping的属性：method
- 指定此方法可以处理的请求的方式
- GET： RequestMethod.GET
- POST: RequestMethod.POST
- 如果用的不是指定的请求方式，会报405:Request method 'GET/POST' not supported
- 如果未指定请求方式，那么默认该方法所有请求方式都可以处理



