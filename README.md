# P2P
P2P Financial lending platform

<h1>【P2P金融借贷平台】</h1>
<pre><code>P2P：金融借贷平台

P2C：产品对客户

B2B：电子商务平台(商对商)

B2C：商对客

O2O：线上平台

U2U：客户对客户

C2C：客户对客户
</code></pre>

<h3>应用技术</h3>
<pre><code>技术应用：ssm\mysql\jdk1.7\tomcat7\H-UI(H-admin-ui)-网站后台\BootStrap

开源技术：第三方登录(QQ、微信、微博)、支付(支付宝、微信、网银支付)--适配器
</code></pre>

<h3>搭建步骤</h3>
<pre><code>1：需要导入【p2p.sql】脚本
2：将工程(maven)导入到开发工具中
3：修改jdbc配置文件
4：部署到tomcat中，然后启动访问
</code></pre>

<p>访问地址：</p>
<pre><code>前端：http://localhost:8080/p2p
后台：http://localhost:8080/p2p/main.do
</code></pre>

<h3>图片上传：</h3>
<p>banner图：</p>
<pre><code>一般是展现在网站头部，两种展现方式，一种通屏，一种居中

一般是在PC用的比较多
</code></pre>

<p>引导图、欢迎导航图：</p>
<pre><code>一般多用于APP中，并且是第一次安装之后才会出现
</code></pre>

<p>开发步骤：</p>
<pre><code>1：一般的图片，我们只需要在数据库中存储的是图片地址（相对路径）
2：获取图片名称之后，进行重命名
3：高并发业务，或者常见的电商网站购物网站，包含小视频，建议不存储到应用服务器上面，需要存储到特定的图片服务器
</code></pre>

<p>高并发方案解决之图片处理：</p>
<p><img src="https://i.imgur.com/akYmsFd.png" /></p>
<h2>第三方登录（QQ\微信）</h2>
<p>业务逻辑：</p>
<pre><code>1：点击QQ图标，进入到授权页面
2：扫描二维码或者输入QQ号码密码，授权，点击登录
3：如果是第一次使用第三方登录，则一般跳转到绑定手机号页面
4：则登录成功，登录后的用户名昵称，则是QQ名称

5：如果是第二次登录，并进行授权，则是可以直接登录成功的
</code></pre>

<p>数据库设计：</p>
<pre><code>1：在user表，增加两个字段，一个字段为QQ号，一个为openID
    用户名、昵称、密码、手机号、邮箱、QQ\weixin\openID
2：验证当前用户信息是否绑定QQ信息
</code></pre>

<p>代码开发步骤：</p>
<pre><code>http://wiki.connect.qq.com/__trashed-2

https://connect.qq.com/index.html
</code></pre>

<p>平台要求：</p>
<pre><code>1：登录QQ互联开发者平台，注册对应的用户信息（公司）
2：去http://wiki.connect.qq.com/sdk%E4%B8%8B%E8%BD%BD 下载对应的开发jar包和帮助文档
3：将依赖jar包和配置属性文件导入到本地工程
4：只需要修改属性文件的前3-4行
5：添加前置接口和回调函数
</code></pre>

<p>网站接入：</p>
<p>1：创建应用</p>
<p><img src="https://i.imgur.com/G3msUmT.png" /></p>
<p>选择需要创建的应用类型，我们以网站应用为例</p>
<p><img src="https://i.imgur.com/VRAd7DC.png" /></p>
<p>点击创建网站应用后，按要求完善信息</p>
<p><img src="https://i.imgur.com/OtcvnNi.png" /></p>
<p><img src="https://i.imgur.com/uvhOylz.png" /></p>
<p>网站信息填写完成，点击“创建应用”后，网站应用创建完成，点击“应用管理”，进入管理中心，在管理中心可以查看到网站获取的appid和appkey，如下图所示：</p>
<p><img src="https://i.imgur.com/Sz1FK4z.png" /></p>
<p>备注：创建移动应用与网站应用步骤方法一致，在此不赘述。</p>
<p>2：点击“应用中心”，应用右侧的“查看”，进入应用详情页面。</p>
<p><img src="https://i.imgur.com/vkTN5FF.png" /></p>
<p>应用详情页面可点击“修改”来编辑应用“基本信息”和“平台信息”。</p>
<p><img src="https://i.imgur.com/9XZcqRb.png" /></p>
<p><img src="https://i.imgur.com/d7MzscC.png" /></p>
<p>点击“应用接口”可查看已获取的接口，使用QQ登录功能。</p>
<p><img src="https://i.imgur.com/dZQj3DW.png" /></p>
<h2>短信、邮件</h2>
<p>短信开发步骤：</p>
<pre><code>1：开通第三方短信平台
2：会提供给一个管理系统的后台用户名和密码
3：登录平台系统后，就可以获取当前余额和发送情况(报表)
4：调用第三方平台jar包(导入工程中)
5：组装消息内容，调用发送消息接口
</code></pre>

<p>短信注意事项：</p>
<pre><code>1：无需保存到数据库
2：安全--发送之前，验证手机号是否存在（是否在系统中存在）
3：发送之后，需要记录发送时间和内容（可选）
4：发送消息的内容（黑字典）
5：发送消息的内容个数
6：一般在发送消息的时候，需要做手机号的特殊处理（每天限制发送的次数）
</code></pre>

<p>邮件开发步骤：</p>
<pre><code>1：开通邮件(发送人)账户信息
2：调用发送邮件接口javamail.jar
3：编辑邮件内容，生成邮件超链接
4：TCP\POP3
</code></pre>

<p>邮件注意事项：</p>
<pre><code>1：发送邮件之前，验证收件人是否存在
2：超链接，点击超链接之后，跳转的是修改密码界面
    安全：其实就是一个回调函数(controller--get)

    xxxx你好：点击下面链接，进入修改密码页面
    http://www.baidu.com/llll/aaa//ddf/updatePassword?email=xxxxx&amp;&amp;ID=adsafaser
    此链接有效期为24小时。

    发送的时候，需要记录发送信息到数据库：

    表结构：id，发送人ID，收件人ID/账户，发送时间，点击次数，超时时间

3：超链接或者邮件发送信息、状态，都需要保存到数据库
</code></pre>
