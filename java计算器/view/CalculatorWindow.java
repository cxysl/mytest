package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import data.*;
public class CalculatorWindow extends JFrame {
    Computer  computer;     //��Ҫ�ṩ��ͼ�Ķ���
    JButton numberButton[]; //���ְ�ť                
    JButton operatorButton[];//�Ӽ��˳���ť
    JButton dot,pOrN,back,equation,clear;//С���㣬������,�˸�,�Ⱥ�,����; 
    JButton sqrt,reciprocal;//��ƽ������������ť
    JTextField resultShow;          //��ʾ������
    JTextField showTempResult; //��ʾ��ǰ������̵���ʱ���
    JLabel     showOperator  ; //��ʾ�������
    JTextField showDataItem; //��ʾ��ǰ���������������
    JTextArea  saveComputerProcess; //��ʾ���㲽��.�����ı���
    JButton saveButton,copyButton,clearTextButton;//���������̵Ȱ�ť
    public CalculatorWindow(){
        computer = new Computer();
        initView();             //���ý���
        initActionListener();  //ע�������
    }
    public void initView(){
        setTitle("������");
        JPanel panelLeft,panelRight; //�����������
        resultShow=new JTextField(10);//����10�������ı���
        resultShow.setHorizontalAlignment(JTextField.LEFT);//���������ʾ
        resultShow.setForeground(Color.blue);//����ǰ��ɫ
        resultShow.setFont(new Font("TimesRoman",Font.BOLD,14));//��������
        resultShow.setEditable(false);//���ɱ༭
        resultShow.setBackground(Color.green);//���ñ���ɫ
        //�ϲ���Ϊ�����ʾ
      
        showTempResult=new JTextField();//�½��ı�
        showTempResult.setHorizontalAlignment(JTextField.RIGHT);//���Ҷ���
        showTempResult.setFont(new Font("Arial",Font.BOLD,14));//��������
        showTempResult.setBackground(Color.cyan);//���ñ���ɫ
        showTempResult.setEditable(false);//���ɱ༭
        
        showOperator = new JLabel();//�½���ǩ
        showOperator.setBackground(Color.pink);//���ñ���ɫ
        showOperator.setFont(new Font("Arial",Font.BOLD,18));//��������
        showOperator.setHorizontalAlignment(JTextField.CENTER);//���ж��롢
        
        showDataItem = new JTextField(); //�½��ı���
        showDataItem.setBackground(Color.white);//���ñ���ɫ
        showDataItem.setHorizontalAlignment(JTextField.LEFT);//�������
        showDataItem.setFont(new Font("Arial",Font.BOLD,14));//��������
        showDataItem.setEditable(false);//���ɱ༭
        
        saveComputerProcess=new JTextArea();//�����ı���
        saveComputerProcess.setEditable(false);//���ɱ༭
        saveComputerProcess.setFont(new Font("����",Font.PLAIN,14));//��������
        
        numberButton=new JButton[10];//�������ְ�ť
        for(int i=0;i<=9;i++){
            numberButton[i]=new JButton(""+i);
            numberButton[i].setFont(new Font("Arial",Font.BOLD,20));//��������
        }
        
        operatorButton=new JButton[4];//�������Ű�ť
        String �������[]={"+","-","*","/"}; 
        for(int i=0;i<4;i++){
           operatorButton[i]=new JButton(�������[i]);
           operatorButton[i].setFont(new Font("Arial",Font.BOLD,20));//��������
        }
        
        
        dot=new JButton(".");
        pOrN=new JButton("+/-"); 
        equation=new JButton("=");
        back  = new JButton("�˸�");
        clear = new JButton("C");
        sqrt=new JButton("sqrt");
        reciprocal=new JButton("1/x");
        saveButton=new JButton("����");
        copyButton=new JButton("����");
        clearTextButton=new JButton("���");    
        
        panelLeft=new JPanel(); //��ʼ���֣�����������Ҫ������
        panelRight=new JPanel();
        panelLeft.setLayout(new BorderLayout()); //������������
        JPanel centerInLeft=new JPanel();//�½����
        Box boxH=Box.createHorizontalBox();//������ʽ��ʽ����
        boxH.add(showTempResult);//���δ��3�����
        boxH.add(showOperator);
        boxH.add(showDataItem);
        
        panelLeft.add(boxH,BorderLayout.NORTH);//��boxH���������������Ϸ�
        panelLeft.add(centerInLeft,BorderLayout.CENTER);//���������м�
        centerInLeft.setLayout(new GridLayout(5,5)); //����5v5���񲼾�
        centerInLeft.add(numberButton[1]); //���ֵĵ�1��
        centerInLeft.add(numberButton[2]); 
        centerInLeft.add(numberButton[3]);
        centerInLeft.add(operatorButton[0]);
        centerInLeft.add(back);
        centerInLeft.add(numberButton[4]);//���ֵĵ�2��
        centerInLeft.add(numberButton[5]);
        centerInLeft.add(numberButton[6]);
        centerInLeft.add(operatorButton[1]);
        centerInLeft.add(clear);
        centerInLeft.add(numberButton[7]);//��3��        
        centerInLeft.add(numberButton[8]);
        centerInLeft.add(numberButton[9]);
        centerInLeft.add(operatorButton[2]);
        centerInLeft.add(reciprocal);
        centerInLeft.add(numberButton[0]); //��4��
        centerInLeft.add(pOrN);
        centerInLeft.add(dot);
        centerInLeft.add(operatorButton[3]);
        centerInLeft.add(sqrt);
        centerInLeft.add(new JLabel());//��5��
        centerInLeft.add(new JLabel());
        centerInLeft.add(new JLabel());
        centerInLeft.add(new JLabel());
        centerInLeft.add(equation);
        
        panelRight.setLayout(new BorderLayout());//�������������µ�
        panelRight.add(resultShow,BorderLayout.NORTH);//�������ʾ������������������
        panelRight.add(
        new JScrollPane(saveComputerProcess),BorderLayout.CENTER);//�½�һ�������������ı����������������м�
        JPanel southInPanelRight=new JPanel();//�½����
        southInPanelRight.add(saveButton);//����3�����
        southInPanelRight.add(copyButton);
        southInPanelRight.add(clearTextButton);
        panelRight.add(southInPanelRight,BorderLayout.SOUTH);//��������������������
        
        JSplitPane split=new JSplitPane//�½�����
                (JSplitPane.HORIZONTAL_SPLIT,panelLeft,panelRight);//�����ڷ�Ϊ��������
        add(split,BorderLayout.CENTER);//���ھ���
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��ִ�йرհ�ť
        setVisible(true);//���ڿ���
        setBounds(100,50,888,258);//����λ�ô�С
        validate(); //��֤���������������
   }
    
   public void initActionListener(){//ע�������
        HandleDigit handleDigit=new HandleDigit(this);
        for(int i=0;i<=9;i++){
          numberButton[i].addActionListener(handleDigit); //Ϊ���ְ�ťע�������
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
