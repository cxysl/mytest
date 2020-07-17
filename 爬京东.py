import re          #调用正则表达式模块
import urllib.request   #调用urllib.request模块
def craw(url,page):    #定义函数
    html1=urllib.request.urlopen(url).read()  #读取对应网页的全部代码
    html1=str(html1)
    pat1='<div id="plist".+? <div class="page clearfix">'   #正则表达式1，
    result1=re.compile(pat1).findall(html1)   #把读取的源码按正则表达式1过滤，将中间的商品列表部分留下，其他过滤掉
    result1=result1[0]   #提取的目标图片链接放在一个列表中
    pat2='<img width="220" height="220" data-img="1" data-lazy-img="//(.+?\.jpg)">'   #正则表达式2
    imagelist=re.compile(pat2).findall(result1)  #第二次过滤，提取一个页面中所有想要爬取的图片链接

    x=1

    for imageurl in imagelist:
        imagename="e:/爬虫实验/"+str(page) +str(x)+".jpg"
        imageurl="http://"+imageurl
        try:
            urllib.request.urlretrieve(imageurl,filename=imagename)
        except urllib.error.URLerror as e:
            if hasattr(e,'code'):   #hasattr判断对象中是否存在name属性，当然对于python的对象而言，属性包含变量和方法；有则返回True，没有则返回False
                x+=1
            if hasattr(e,'reason'):
                x+=1
        x+=1
for i in range(1,147):
    url='http://list.jd.com/list.html?cat=9987,653,655&page='+str(i)
    craw(url,i)