#include<stdio.h>
#include<stdlib.h>
#include<string.h>



#define max 100



int g=0;  //全局
int h=5;



struct user      //存储用户
{
	char username[20];
	char password[20];
}user[3]={
	{"Lucky",  "001"},
	{"Happy",  "100"},
	{"Find",  "999"}
};




struct student
{
	char name[max]; //姓名
	char num[max];  //学号
	char sex[max];   //性别
	int chinese;   //语文成绩
	int mathematic;  //数学成绩
	int english;  //英语成绩
	int compuer;  //计算机成绩
}s[5]={
	{  "小明", "00001", "boy", 80,90,80,90},
	{  "小王", "00002", "boy", 60,80,90,50},
	{  "小红", "00003", "girl", 85,65,75,90},
	{  "小陈", "00004", "boy", 55,65,75,80},
	{  "小青", "00005", "girl", 90,95,98,99}
       };
struct student *p;




//主菜单函数声明
void login();  //登入函数
void index();  //主界面函数
void input_record();  //输入学生成绩处理   1
void show_record();  //显示学生成绩处理   2   
void search_record();  //查询学生成绩处理   3
void change_record();  //更新学生成绩处理   4
void detele_record();  //删除学生信息   5
void calc_record();  //计算成绩处理   6
void save_record();  //保存处理   7
void exit_record();  //退出   8


//查询子函数声明
void search_by_num();  //学号查询
void search_by_name();  //姓名查询
void search_by_sex();  //性别查询
void search_by_exit();  //返回上一级


//计算子函数声明
void calc_sum();  //计算总成绩
void calc_ave();  //计算平均成绩
void calc_eixt();  //返回上一级


//自定义函数
void print_table();//查询表格
void print_table_sum();//总成绩表格
void print_table_ave();//平均分表格
void read();     //将文件中的数据读入到结构体数组中






int main()    //主函数
{
    index() ;
    return 0;
}





void login(){     //登入函数
	int i;
	char a[20],b[20];
	printf("请输入账号名\n");
	scanf("%s",a);
	printf("请输入密码\n");
	scanf("%s",b);
	for(i=0;i<3;i++)
		if(strcmp(a,user[i].username)==0&&strcmp(b,user[i].password)==0)
		{
			printf("登入成功!\n");
			system("cls");
			index();
			break;

		}


		if(i==3)     //密码只允许输错三次
		{
			system("cls");
			printf("登入失败！\n");
			g++;
				if(g>=3) 
				{
					printf("你已经输错三次，将自动退出系统\n");
					exit(1);
				}
				else login();
		}
}







void index() //主界面
{ 
	read();
	system("cls");
	int x;
	printf("欢迎来到学生管理系统\n");
	printf("~~~~~~~~~~~~~~~~~~~~~\n");
	printf("请选择您需要的操作\n");
	printf("1 输入学生信息\n2 显示学生信息\n3 查询学生信息\n4 更新学生信息\n5 删除学生信息\n6 计算学生成绩\n7 保存\n8 退出\n");
    printf("~~~~~~~~~~~~~~~~~\n");
	scanf("%d",&x);
	if(x==1) 
		input_record();  //输入
	if(x==2)
		show_record();  //显示
	if(x==3)
		search_record();  //查询
	if(x==4)
		change_record();  //更新
	if(x==5)
		detele_record();  //删除
	if(x==6)
		calc_record();  //计算
	if(x==7)
		save_record();  //保存
	if(x==8)
		exit_record();  //退出
	else
	  {
		 printf("输入错误，即将重新进入主界面\n");
		 index();
	  }

}



void input_record()  //输入学生成绩处理   1
{
		char v,z;
     
  aa:
{   system("cls");

	printf("请输入学生姓名：\n");
	scanf("%s",s[h].name);


	printf("请输入学生学号：\n");
	scanf("%s",s[h].num);


	printf("请输入学生性别：\n");
	scanf("%s",s[h].sex);


	printf("请输入学生语文成绩：\n");
	scanf("%d",&s[h].chinese);


	printf("请输入学生数学成绩：\n");
	scanf("%d",&s[h].mathematic);


	printf("请输入学生英语成绩：\n");
	scanf("%d",&s[h].english);


	printf("请输入学生计算机成绩：\n");
	scanf("%d",&s[h].compuer);



    

    printf("请选择是否保存(y或n)\n");
	scanf("%s",&z);

	if(z=='y')
    { 
	h++;
	save_record();
	}

    printf("是否继续添加，请选择(y或n)(否会回到主界面)\n"); 
	scanf("%s",&v);

    if(v=='y')
	goto aa;

	else 
	index();
}
}
	


void show_record()  //显示学生成绩处理   2   
{
	system("cls");

	int i,k,x;
	x=h;

	print_table();
	for(i=0;i<x;i++)
	{
		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
			                s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);

	}

	printf("1.返回主界面\n 2.返回上一级\n");
	scanf("%d",&k);

	if(k==1) 
		index();
	else
		index();

}





void search_record()  //查询学生成绩处理   3
{
	system("cls");

    int x;

	printf("1 按学号查询\n");
	printf("2 按姓名查询\n");
	printf("3 按性别查询\n");
    printf("4 返回上一级\n");
	scanf("%d",&x);
	
	if(x==1)
		search_by_num();//学号
	if(x==2)
		search_by_name();//姓名
	if(x==3)
		search_by_sex();//性别
	if(x==4)              
		search_by_exit();//返回
	else
	{
		printf("输入错误\n");
		search_record();
	}

	
}





void print_table()//表格
{
 printf("+----------+----------+----------+------+------+------+------+\n");
 printf("|   姓名   |   学号   |   性别   | 语文 | 数学 | 英语 |计算机|\n");
 printf("+----------+----------+----------+------+------+------+------+\n");
}




void search_by_num()//学号查询
{
	int i,k;
	char num1[max];

    system("cls");

	printf("请输入查找学号\n");
	scanf("%s",num1);

	for(i=0;i<h;i++)
		if(strcmp(num1,s[i].num)==0)
	{
			print_table();
			printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
				            s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
	        break;
		}

	if(i==h)
		printf("不存在这个学号\n");

	printf("1.返回主界面\n 2.继续查询\n");
	scanf("%d",&k);

	if(k==1)
		index();
	else
		search_record();
}





void search_by_name()//姓名查询
{
	int i,k;
	char name1[max];

    system("cls");
	printf("请输入查找的姓名\n");
	scanf("%s",name1);

	for(i=0;i<h;i++)
		if(strcmp(name1,s[i].name)==0)
	{
			print_table();
			printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
	break;
		}

	if(i==h)
		printf("不存在这个姓名\n");

	printf("1.返回主界面\n 2.继续查询\n");
	scanf("%d",&k);

	if(k==1)
		index();
	else 
		search_record();

}
void search_by_sex()//性别查询
{
	int i,k;
	char sex1[max];

    system("cls");
	printf("请输入查找的性别（boy or girl）\n");
	scanf("%s",sex1);
    print_table();   //表格

	for(i=0;i<h;i++)
		if(strcmp(sex1,s[i].sex)==0)
		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);

	if(i==h)
	printf("1.返回主界面\n 2.继续查询\n");
    scanf("%d",&k);

	if(k==1) 
		index();
	else 
		search_record();

}




void search_by_exit()//返回上一级
{
	index();
}




void change_record()  //更新学生成绩处理   4
{

	system("cls");
	int i;
	char name2[max],sex2[max];
	int chinese2,mathematic2,english2,compuer2;
	char numbefor[max];

printf("请输入要修改的学生的学号\n");     //需知道学号查询
scanf("%s",numbefor);

for(i=0;i<h;i++)

	if(strcmp(numbefor,s[i].num)==0)
	{
		
        printf("修改前：\n");
         print_table();  //打印表格

		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
			               s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);

	printf("请分别输入修改后信息\n");


	printf("请输入学生姓名：");
	scanf("%s",name2);

	printf("请输入学生性别：");
	scanf("%s",sex2);

	printf("请输入学生语文成绩：");
	scanf("%d",&chinese2);

	printf("请输入学生数学成绩：");
	scanf("%d",&mathematic2);

	printf("请输入学生英语成绩：");
	scanf("%d",&english2);
	
	printf("请输入学生计算机成绩：");
	scanf("%d",&compuer2);


    printf("请选择是否保存(y或n)\n");
	getchar();
	if(getchar()=='y') 
	{

	strcpy(s[i].name,name2);
	strcpy(s[i].sex,sex2);

	s[i].chinese=chinese2;
	s[i].mathematic=mathematic2;
	s[i].english=english2;
	s[i].compuer=compuer2;
	save_record();

	printf("修改后：\n");
	printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
		                  s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
	}
  
	}
if(i==h) printf("抱歉！没有这位学生\n");
	 printf("是否继续修改，请选择（y或n）\n"); 
	getchar();
	if(getchar()=='y')
		change_record();
	else
		index();


}





void detele_record()  //删除学生信息   5
{	
	system("cls");
	char num4[max];
	char a;
	int v;
	printf("请输入要删学生的学号\n");
	scanf("%s",num4);
	
		int i,j;
    for(i=0;i<h;i++)
		if(strcmp(num4,s[i].num)==0) 
		{	printf("你将要删除该学生信息\n");	
			printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
		                  s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
		        printf("    y 确认删除    n 取消\n");
	        	scanf("%s",&a);
      	       if(a=='y')
			   {
			for(j=i;j<h;j++)

			{  strcpy(s[j].num,s[j+1].num);  strcpy(s[j].name,s[j+1].name);  strcpy(s[j].sex,s[j+1].sex);
		      s[j].chinese=s[j+1].chinese;  s[j].mathematic=s[j+1].mathematic;  s[j].english=s[j+1].english;
	          s[j].compuer=s[j+1].compuer ;}
			printf("删除成功！\n");

	           h--;
			   save_record();
			   }
			   else
				   printf("已取消操作\n");
	   
		}
		if(i==h)	printf("没有这个学号的学生\n");
		printf("1 继续删除 2 返回上一级\n");
		scanf("%d",&v);
		if(v==1)  detele_record() ;
		else index;
		
		

}






void calc_record()  //计算成绩处理   6
{
	system("cls");
	int x;
	printf("1 计算总成绩\n");
	printf("2 计算平均分\n");
	printf("3 返回上一级\n");
	scanf("%d",&x);

	if(x==1)
		calc_sum();
	if(x==2)
		calc_ave();
	if(x==3)
		index();
	else
	  {
		  printf("输入错误\n");
		  calc_record();
	  }

}


void print_table_sum()//总成绩表格
{
 printf("+----------+----------+----------+------+------+------+------+------+\n");
 printf("|   姓名   |   学号   |   性别   | 语文 | 数学 | 英语 |计算机|总成绩|\n");
 printf("+----------+----------+----------+------+------+------+------+------+\n");
}


void print_table_ave()//平均分表格
{
 printf("+----------+----------+----------+------+------+------+------+------+\n");
 printf("|   姓名   |   学号   |   性别   | 语文 | 数学 | 英语 |计算机|平均分|\n");
 printf("+----------+----------+----------+------+------+------+------+------+\n");
}



void calc_sum()//计算总成绩
{
	print_table_sum();
	int i,k,sum=0;
	int x=h;

	for(i=0;i<x;i++)
	{
		sum=s[i].chinese+s[i].mathematic+s[i].english+s[i].compuer;
		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|%6d\n",
			           s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer,sum);
	}


      printf("1 返回上一级\n 2 返回主界面\n ");
		scanf("%d",&k);

	if(k==1)
		calc_record();
	if(k==2)
		index();
	else
	{
		printf("输入错误！\n");
		calc_record();
	}

}




void calc_ave()//计算平均成绩
{
	print_table_ave();
	int i,k;
	int x=h;
	float ave;

	for(i=0;i<x;i++)
	{
		ave=(s[i].chinese+s[i].mathematic+s[i].english+s[i].compuer)*0.25;
		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|%6.2f\n",
			                s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer,ave);
	if(i==6)
		break;
	}


	printf("1 返回上一级\n 2 返回主界面\n ");
		scanf("%d",&k);

	if(k==1)
		calc_record();
	if(k==2)
		index();
	else
	{
		printf("输入错误！\n");
		calc_record();
	}
}




void calc_eixt()//返回上一级
{
	index();
}





void save_record()  //保存处理   7

   //{void save( )  将结构体数组学生数据写入到文件中
{
	FILE *fp;
 int i;

 if((fp=fopen("student-list","wb"))==NULL)
{ printf("cannot open file\n");
  return;}


 fwrite(&h,4,1,fp);    //学生人数写入文件



 for(i=0;i<h;i++)/*二进制写*/
 if(fwrite(&s[i],sizeof(struct student),1,fp)!=1)
 printf("file write error\n");/*出错处理*/
 else printf("file write sucess\n");


 
 fclose(fp); 

} /*关闭文件*/   



 void read()     //将文件中的数据读入到结构体数组中
 { 
	 FILE *fp;


 int i;


 if((fp=fopen("student-list","rb"))==NULL)
{ 
	 printf("cannot open file\n");
  return;
 }



 fread(&h,4,1,fp);     //读取学生人数



 for(i=0;i<h;i++)/*二进制写*/
 if(fread(&s[i],sizeof(struct student),1,fp)!=1)
 printf("file read error\n");/*出错处理*/
 else printf("file read sucess\n");



 fclose(fp);
 




}



void exit_record()  //退出   8
{
	login();
}
