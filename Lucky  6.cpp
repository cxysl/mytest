#include<stdio.h>
#include<stdlib.h>
#include<string.h>



#define max 100



int g=0;  //ȫ��
int h=5;



struct user      //�洢�û�
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
	char name[max]; //����
	char num[max];  //ѧ��
	char sex[max];   //�Ա�
	int chinese;   //���ĳɼ�
	int mathematic;  //��ѧ�ɼ�
	int english;  //Ӣ��ɼ�
	int compuer;  //������ɼ�
}s[5]={
	{  "С��", "00001", "boy", 80,90,80,90},
	{  "С��", "00002", "boy", 60,80,90,50},
	{  "С��", "00003", "girl", 85,65,75,90},
	{  "С��", "00004", "boy", 55,65,75,80},
	{  "С��", "00005", "girl", 90,95,98,99}
       };
struct student *p;




//���˵���������
void login();  //���뺯��
void index();  //�����溯��
void input_record();  //����ѧ���ɼ�����   1
void show_record();  //��ʾѧ���ɼ�����   2   
void search_record();  //��ѯѧ���ɼ�����   3
void change_record();  //����ѧ���ɼ�����   4
void detele_record();  //ɾ��ѧ����Ϣ   5
void calc_record();  //����ɼ�����   6
void save_record();  //���洦��   7
void exit_record();  //�˳�   8


//��ѯ�Ӻ�������
void search_by_num();  //ѧ�Ų�ѯ
void search_by_name();  //������ѯ
void search_by_sex();  //�Ա��ѯ
void search_by_exit();  //������һ��


//�����Ӻ�������
void calc_sum();  //�����ܳɼ�
void calc_ave();  //����ƽ���ɼ�
void calc_eixt();  //������һ��


//�Զ��庯��
void print_table();//��ѯ���
void print_table_sum();//�ܳɼ����
void print_table_ave();//ƽ���ֱ��
void read();     //���ļ��е����ݶ��뵽�ṹ��������






int main()    //������
{
    index() ;
    return 0;
}





void login(){     //���뺯��
	int i;
	char a[20],b[20];
	printf("�������˺���\n");
	scanf("%s",a);
	printf("����������\n");
	scanf("%s",b);
	for(i=0;i<3;i++)
		if(strcmp(a,user[i].username)==0&&strcmp(b,user[i].password)==0)
		{
			printf("����ɹ�!\n");
			system("cls");
			index();
			break;

		}


		if(i==3)     //����ֻ�����������
		{
			system("cls");
			printf("����ʧ�ܣ�\n");
			g++;
				if(g>=3) 
				{
					printf("���Ѿ�������Σ����Զ��˳�ϵͳ\n");
					exit(1);
				}
				else login();
		}
}







void index() //������
{ 
	read();
	system("cls");
	int x;
	printf("��ӭ����ѧ������ϵͳ\n");
	printf("~~~~~~~~~~~~~~~~~~~~~\n");
	printf("��ѡ������Ҫ�Ĳ���\n");
	printf("1 ����ѧ����Ϣ\n2 ��ʾѧ����Ϣ\n3 ��ѯѧ����Ϣ\n4 ����ѧ����Ϣ\n5 ɾ��ѧ����Ϣ\n6 ����ѧ���ɼ�\n7 ����\n8 �˳�\n");
    printf("~~~~~~~~~~~~~~~~~\n");
	scanf("%d",&x);
	if(x==1) 
		input_record();  //����
	if(x==2)
		show_record();  //��ʾ
	if(x==3)
		search_record();  //��ѯ
	if(x==4)
		change_record();  //����
	if(x==5)
		detele_record();  //ɾ��
	if(x==6)
		calc_record();  //����
	if(x==7)
		save_record();  //����
	if(x==8)
		exit_record();  //�˳�
	else
	  {
		 printf("������󣬼������½���������\n");
		 index();
	  }

}



void input_record()  //����ѧ���ɼ�����   1
{
		char v,z;
     
  aa:
{   system("cls");

	printf("������ѧ��������\n");
	scanf("%s",s[h].name);


	printf("������ѧ��ѧ�ţ�\n");
	scanf("%s",s[h].num);


	printf("������ѧ���Ա�\n");
	scanf("%s",s[h].sex);


	printf("������ѧ�����ĳɼ���\n");
	scanf("%d",&s[h].chinese);


	printf("������ѧ����ѧ�ɼ���\n");
	scanf("%d",&s[h].mathematic);


	printf("������ѧ��Ӣ��ɼ���\n");
	scanf("%d",&s[h].english);


	printf("������ѧ��������ɼ���\n");
	scanf("%d",&s[h].compuer);



    

    printf("��ѡ���Ƿ񱣴�(y��n)\n");
	scanf("%s",&z);

	if(z=='y')
    { 
	h++;
	save_record();
	}

    printf("�Ƿ������ӣ���ѡ��(y��n)(���ص�������)\n"); 
	scanf("%s",&v);

    if(v=='y')
	goto aa;

	else 
	index();
}
}
	


void show_record()  //��ʾѧ���ɼ�����   2   
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

	printf("1.����������\n 2.������һ��\n");
	scanf("%d",&k);

	if(k==1) 
		index();
	else
		index();

}





void search_record()  //��ѯѧ���ɼ�����   3
{
	system("cls");

    int x;

	printf("1 ��ѧ�Ų�ѯ\n");
	printf("2 ��������ѯ\n");
	printf("3 ���Ա��ѯ\n");
    printf("4 ������һ��\n");
	scanf("%d",&x);
	
	if(x==1)
		search_by_num();//ѧ��
	if(x==2)
		search_by_name();//����
	if(x==3)
		search_by_sex();//�Ա�
	if(x==4)              
		search_by_exit();//����
	else
	{
		printf("�������\n");
		search_record();
	}

	
}





void print_table()//���
{
 printf("+----------+----------+----------+------+------+------+------+\n");
 printf("|   ����   |   ѧ��   |   �Ա�   | ���� | ��ѧ | Ӣ�� |�����|\n");
 printf("+----------+----------+----------+------+------+------+------+\n");
}




void search_by_num()//ѧ�Ų�ѯ
{
	int i,k;
	char num1[max];

    system("cls");

	printf("���������ѧ��\n");
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
		printf("���������ѧ��\n");

	printf("1.����������\n 2.������ѯ\n");
	scanf("%d",&k);

	if(k==1)
		index();
	else
		search_record();
}





void search_by_name()//������ѯ
{
	int i,k;
	char name1[max];

    system("cls");
	printf("��������ҵ�����\n");
	scanf("%s",name1);

	for(i=0;i<h;i++)
		if(strcmp(name1,s[i].name)==0)
	{
			print_table();
			printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
	break;
		}

	if(i==h)
		printf("�������������\n");

	printf("1.����������\n 2.������ѯ\n");
	scanf("%d",&k);

	if(k==1)
		index();
	else 
		search_record();

}
void search_by_sex()//�Ա��ѯ
{
	int i,k;
	char sex1[max];

    system("cls");
	printf("��������ҵ��Ա�boy or girl��\n");
	scanf("%s",sex1);
    print_table();   //���

	for(i=0;i<h;i++)
		if(strcmp(sex1,s[i].sex)==0)
		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);

	if(i==h)
	printf("1.����������\n 2.������ѯ\n");
    scanf("%d",&k);

	if(k==1) 
		index();
	else 
		search_record();

}




void search_by_exit()//������һ��
{
	index();
}




void change_record()  //����ѧ���ɼ�����   4
{

	system("cls");
	int i;
	char name2[max],sex2[max];
	int chinese2,mathematic2,english2,compuer2;
	char numbefor[max];

printf("������Ҫ�޸ĵ�ѧ����ѧ��\n");     //��֪��ѧ�Ų�ѯ
scanf("%s",numbefor);

for(i=0;i<h;i++)

	if(strcmp(numbefor,s[i].num)==0)
	{
		
        printf("�޸�ǰ��\n");
         print_table();  //��ӡ���

		printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
			               s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);

	printf("��ֱ������޸ĺ���Ϣ\n");


	printf("������ѧ��������");
	scanf("%s",name2);

	printf("������ѧ���Ա�");
	scanf("%s",sex2);

	printf("������ѧ�����ĳɼ���");
	scanf("%d",&chinese2);

	printf("������ѧ����ѧ�ɼ���");
	scanf("%d",&mathematic2);

	printf("������ѧ��Ӣ��ɼ���");
	scanf("%d",&english2);
	
	printf("������ѧ��������ɼ���");
	scanf("%d",&compuer2);


    printf("��ѡ���Ƿ񱣴�(y��n)\n");
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

	printf("�޸ĺ�\n");
	printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
		                  s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
	}
  
	}
if(i==h) printf("��Ǹ��û����λѧ��\n");
	 printf("�Ƿ�����޸ģ���ѡ��y��n��\n"); 
	getchar();
	if(getchar()=='y')
		change_record();
	else
		index();


}





void detele_record()  //ɾ��ѧ����Ϣ   5
{	
	system("cls");
	char num4[max];
	char a;
	int v;
	printf("������Ҫɾѧ����ѧ��\n");
	scanf("%s",num4);
	
		int i,j;
    for(i=0;i<h;i++)
		if(strcmp(num4,s[i].num)==0) 
		{	printf("�㽫Ҫɾ����ѧ����Ϣ\n");	
			printf("|%10s|%10s|%10s|%6d|%6d|%6d|%6d|\n",
		                  s[i].name,s[i].num,s[i].sex,s[i].chinese,s[i].mathematic,s[i].english,s[i].compuer);
		        printf("    y ȷ��ɾ��    n ȡ��\n");
	        	scanf("%s",&a);
      	       if(a=='y')
			   {
			for(j=i;j<h;j++)

			{  strcpy(s[j].num,s[j+1].num);  strcpy(s[j].name,s[j+1].name);  strcpy(s[j].sex,s[j+1].sex);
		      s[j].chinese=s[j+1].chinese;  s[j].mathematic=s[j+1].mathematic;  s[j].english=s[j+1].english;
	          s[j].compuer=s[j+1].compuer ;}
			printf("ɾ���ɹ���\n");

	           h--;
			   save_record();
			   }
			   else
				   printf("��ȡ������\n");
	   
		}
		if(i==h)	printf("û�����ѧ�ŵ�ѧ��\n");
		printf("1 ����ɾ�� 2 ������һ��\n");
		scanf("%d",&v);
		if(v==1)  detele_record() ;
		else index;
		
		

}






void calc_record()  //����ɼ�����   6
{
	system("cls");
	int x;
	printf("1 �����ܳɼ�\n");
	printf("2 ����ƽ����\n");
	printf("3 ������һ��\n");
	scanf("%d",&x);

	if(x==1)
		calc_sum();
	if(x==2)
		calc_ave();
	if(x==3)
		index();
	else
	  {
		  printf("�������\n");
		  calc_record();
	  }

}


void print_table_sum()//�ܳɼ����
{
 printf("+----------+----------+----------+------+------+------+------+------+\n");
 printf("|   ����   |   ѧ��   |   �Ա�   | ���� | ��ѧ | Ӣ�� |�����|�ܳɼ�|\n");
 printf("+----------+----------+----------+------+------+------+------+------+\n");
}


void print_table_ave()//ƽ���ֱ��
{
 printf("+----------+----------+----------+------+------+------+------+------+\n");
 printf("|   ����   |   ѧ��   |   �Ա�   | ���� | ��ѧ | Ӣ�� |�����|ƽ����|\n");
 printf("+----------+----------+----------+------+------+------+------+------+\n");
}



void calc_sum()//�����ܳɼ�
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


      printf("1 ������һ��\n 2 ����������\n ");
		scanf("%d",&k);

	if(k==1)
		calc_record();
	if(k==2)
		index();
	else
	{
		printf("�������\n");
		calc_record();
	}

}




void calc_ave()//����ƽ���ɼ�
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


	printf("1 ������һ��\n 2 ����������\n ");
		scanf("%d",&k);

	if(k==1)
		calc_record();
	if(k==2)
		index();
	else
	{
		printf("�������\n");
		calc_record();
	}
}




void calc_eixt()//������һ��
{
	index();
}





void save_record()  //���洦��   7

   //{void save( )  ���ṹ������ѧ������д�뵽�ļ���
{
	FILE *fp;
 int i;

 if((fp=fopen("student-list","wb"))==NULL)
{ printf("cannot open file\n");
  return;}


 fwrite(&h,4,1,fp);    //ѧ������д���ļ�



 for(i=0;i<h;i++)/*������д*/
 if(fwrite(&s[i],sizeof(struct student),1,fp)!=1)
 printf("file write error\n");/*������*/
 else printf("file write sucess\n");


 
 fclose(fp); 

} /*�ر��ļ�*/   



 void read()     //���ļ��е����ݶ��뵽�ṹ��������
 { 
	 FILE *fp;


 int i;


 if((fp=fopen("student-list","rb"))==NULL)
{ 
	 printf("cannot open file\n");
  return;
 }



 fread(&h,4,1,fp);     //��ȡѧ������



 for(i=0;i<h;i++)/*������д*/
 if(fread(&s[i],sizeof(struct student),1,fp)!=1)
 printf("file read error\n");/*������*/
 else printf("file read sucess\n");



 fclose(fp);
 




}



void exit_record()  //�˳�   8
{
	login();
}
