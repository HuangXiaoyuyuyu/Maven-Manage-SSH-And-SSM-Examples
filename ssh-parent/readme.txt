之前在这个文件夹上传的一个是Maven管理SSH(Struts2+Hibernate+Spring) 用的IDE是Eclipse,
另一个是Maven管理SSM(Spring+SpringMVC+MyBatis) 用的IDE是IDEA
但是现在很多业界的公司项目都是比较大的，而且都是分模块开发，所以这里特地写了一个
Maven管理SSH(Struts2+Hibernate+Spring)的分模块开发，使用的IDE是Eclipse
注意事项：
	1.分模块开发时 首先创建父工程，打包方式选择pom
	2.然后在父工程里创建模块，注意这里是创建模块 模块 模块(重要的事情说三遍)，然后打开子模块的pom.xml文件，你会发现pom.xml的坐标就是父工程的坐标。
	3.创建的每个子模块中，只要完成该模块完成的东西，比如service模块  只要完成service应该完成的东西 包括配置文件也一样
	4.创建的子模块处了web模块打包个格式war，其余的打包格式为jar。
	5.完成每个模块后要记得发布到本地仓库，公司的话就要发布到私服，因为一个项目的多个模块会有关联，就像service模块肯定会用到dao模块
	6.最后运行的时候运行web模块或者父工程都可以。
有任何疑问请留言，谢谢。