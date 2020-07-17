package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import data.*;
public class CalculatorWindow extends JFrame {
    Computer  computer;     //需要提供视图的对象
    JButton numberButton[]; //数字按钮                
    JButton operatorButton[];//加减乘除按钮
    JButton dot,pOrN,back,equation,clear;//小数点，正负号,退格,等号,清零; 
    JButton sqrt,reciprocal;//求平方根，求倒数按钮
    JTextField resultShow;          //显示计算结果
    JTextField showTempResult; //显示当前计算过程的临时结果
    JLabel     showOperator  ; //显示运算符号
    JTextField showDataItem; //显示当前参与运算的数据项
    JTextArea  saveComputerProcess; //显示计算步骤.多行文本区
    JButton saveButton,copyButton,clearTextButton;//保存计算过程等按钮
    public CalculatorWindow(){
        computer = new Computer();
        initView();             //设置界面
        initActionListener();  //注册监视器
    }
    public void initView(){
        setTitle("计算器");
        JPanel panelLeft,panelRight; //声明两块面板
        resultShow=new JTextField(10);//建立10列行数文本框
        resultShow.setHorizontalAlignment(JTextField.LEFT);//居左对齐显示
        resultShow.setForeground(Color.blue);//设置前景色
        resultShow.setFont(new Font("TimesRoman",Font.BOLD,14));//设置字体
        resultShow.setEditable(false);//不可编辑
        resultShow.setBackground(Color.green);//设置背景色
        //上部分为结果显示
      
        showTempResult=new JTextField();//新建文本
        showTempResult.setHorizontalAlignment(JTextField.RIGHT);//居右对齐
        showTempResult.setFont(new Font("Arial",Font.BOLD,14));//设置字体
        showTempResult.setBackground(Color.cyan);//设置背景色
        showTempResult.setEditable(false);//不可编辑
        
        showOperator = new JLabel();//新建标签
        showOperator.setBackground(Color.pink);//设置背景色
        showOperator.setFont(new Font("Arial",Font.BOLD,18));//设置字体
        showOperator.setHorizontalAlignment(JTextField.CENTER);//居中对齐、
        
        showDataItem = new JTextField(); //新建文本框
        showDataItem.setBackground(Color.white);//设置背景色
        showDataItem.setHorizontalAlignment(JTextField.LEFT);//居左对齐
        showDataItem.setFont(new Font("Arial",Font.BOLD,14));//设置字体
        showDataItem.setEditable(false);//不可编辑
        
        saveComputerProcess=new JTextArea();//创建文本区
        saveComputerProcess.setEditable(false);//不可编辑
        saveComputerProcess.setFont(new Font("宋体",Font.PLAIN,14));//设置字体
        
        numberButton=new JButton[10];//创建数字按钮
        for(int i=0;i<=9;i++){
            numberButton[i]=new JButton(""+i);
            numberButton[i].setFont(new Font("Arial",Font.BOLD,20));//设置字体
        }
        
        operatorButton=new JButton[4];//创建符号按钮
        String 运算符号[]={"+","-","*","/"}; 
        for(int i=0;i<4;i++){
           operatorButton[i]=new JButton(运算符号[i]);
           operatorButton[i].setFont(new Font("Arial",Font.BOLD,20));//设置字体
        }
        
        
        dot=new JButton(".");
        pOrN=new JButton("+/-"); 
        equation=new JButton("=");
        back  = new JButton("退格");
        clear = new JButton("C");
        sqrt=new JButton("sqrt");
        reciprocal=new JButton("1/x");
        saveButton=new JButton("保存");
        copyButton=new JButton("复制");
        clearTextButton=new JButton("清除");    
        
        panelLeft=new JPanel(); //开始布局，创建布局需要的容器
        panelRight=new JPanel();
        panelLeft.setLayout(new BorderLayout()); //声明容器方法
        JPanel centerInLeft=new JPanel();//新建面板
        Box boxH=Box.createHorizontalBox();//创建行式盒式容器
        boxH.add(showTempResult);//依次存放3个组件
        boxH.add(showOperator);
        boxH.add(showDataItem);
        
        panelLeft.add(boxH,BorderLayout.NORTH);//将boxH容器放置左面板的上方
        panelLeft.add(centerInLeft,BorderLayout.CENTER);//将面板放置中间
        centerInLeft.setLayout(new GridLayout(5,5)); //创建5v5网格布局
        centerInLeft.add(numberButton[1]); //布局的第1行
        centerInLeft.add(numberButton[2]); 
        centerInLeft.add(numberButton[3]);
        centerInLeft.add(operatorButton[0]);
        centerInLeft.add(back);
        centerInLeft.add(numberButton[4]);//布局的第2行
        centerInLeft.add(numberButton[5]);
        centerInLeft.add(numberButton[6]);
        centerInLeft.add(operatorButton[1]);
        centerInLeft.add(clear);
        centerInLeft.add(numberButton[7]);//第3行        
        centerInLeft.add(numberButton[8]);
        centerInLeft.add(numberButton[9]);
        centerInLeft.add(operatorButton[2]);
        centerInLeft.add(reciprocal);
        centerInLeft.add(numberButton[0]); //第4行
        centerInLeft.add(pOrN);
        centerInLeft.add(dot);
        centerInLeft.add(operatorButton[3]);
        centerInLeft.add(sqrt);
        centerInLeft.add(new JLabel());//第5行
        centerInLeft.add(new JLabel());
        centerInLeft.add(new JLabel());
        centerInLeft.add(new JLabel());
        centerInLeft.add(equation);
        
        panelRight.setLayout(new BorderLayout());//容器方法声明猜的
        panelRight.add(resultShow,BorderLayout.NORTH);//将结果显示容器放置有面板的上面
        panelRight.add(
        new JScrollPane(saveComputerProcess),BorderLayout.CENTER);//新建一个带滚动条的文本区，放置有面板的中间
        JPanel southInPanelRight=new JPanel();//新建面板
        southInPanelRight.add(saveButton);//放置3个组件
        southInPanelRight.add(copyButton);
        southInPanelRight.add(clearTextButton);
        panelRight.add(southInPanelRight,BorderLayout.SOUTH);//将容器放置有面板的南面
        
        JSplitPane split=new JSplitPane//新建窗口
                (JSplitPane.HORIZONTAL_SPLIT,panelLeft,panelRight);//将窗口分为左右两块
        add(split,BorderLayout.CENTER);//窗口居中
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可执行关闭按钮
        setVisible(true);//窗口可视
        setBounds(100,50,888,258);//窗口位置大小
        validate(); //验证容器及其所有组件
   }
    
   public void initActionListener(){//注册监视器
        HandleDigit handleDigit=new HandleDigit(this);
        for(int i=0;i<=9;i++){
          numberButton[i].addActionListener(handleDigit); //为数字按钮注册监视器
        } 
        dot.addActionListener(handleDigit);
        HandleOperator handleOperator = new HandleOperator(this); 
        for(int i=0;i<4;i++){
          operatorButton[i].addActionListener(handleOperator); 
        }
        pOrN.addActionListener(new HandlePN(this));
        sqrt.addActionListener(new HandleSqrt(this));
        reciprocal.addActionListener(new HandleReciprocal(this));
        back.addActionListener(new HandleBack(this));
        equation.addActionListener(new HandleEquation(this));
        clear.addActionListener(new HandleClear(this));
        HandleFile handleFile = new HandleFile(this);
        saveButton.addActionListener(handleFile);
        copyButton.addActionListener(handleFile);
        clearTextButton.addActionListener(handleFile);
   }
}
