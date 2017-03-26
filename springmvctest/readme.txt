首先：点击springmvctest文件夹进入，能看到readme.text就算成功
其次：按住shift并且点鼠标右键，然后找到“在此处打开命令窗口”点击，会出现一个黑框
然后：输入mvn clean compile点击回车会黑框出现加载，等一会，会出现build success后，再输入mvn jetty：run点击回车，就会看到跑成功了，出现一大段的加载，不用怕，正常的，然后会出现“。。。。of 3 seconds”，那么，恭喜你启动了jetty服务器
最后：打开浏览器，在你平时写网址（www.baidu.com）那里，输入:localhost:8088/springmvctext/views/login.do.jsp 回车，就会进入登陆页面，再给用户输入：mary   密码输入：mary  点击登陆，然后进去了就随便点，如果删除的话，请先点“新建”，添加几条记录，然后对准了customerid， 再在编辑/删除里面进行操作，别的什么更新随便点，我的这个web项目实现了所有功能：增删改查都有！谢谢观看！