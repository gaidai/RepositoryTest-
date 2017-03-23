
package goroskop;

import java.io.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame extends JFrame {
    
    Random ra = new Random();
    
    String td[] = {"Сегодня вы с горечью обнаружите, что \"делу - время, потехе - час\", а вовсе не наоборот. Что ж, постарайтесь научиться получать удовольствие и от работы. ",
                  " Сегодняшний день будет для вас чрезвычайно удачным в смысле приобретения полезных знакомств. Возможно, с первого взгляда они таковыми и не покажутся, но в будущем непременно себя оправдают",
                  " Вы уже и так знаете достаточно много. Чем больше мелких подробностей по интересующему вас вопросу вы накопаете, тем труднее вам будет его осмыслить. Сегодня вы можете вполне доверять интуиции. ",
                  " Нынче вам не стоит делать ничего, что не было бы тщательно продумано и несколько раз взвешено. Любое неаккуратное движение может вызвать скорые и весьма бурные последствия. ",
                  " Оптимизм - вот что сегодня движет миром и, в частности, вами. Вы сегодня по степени подвижности подобны миксеру, включенному на последнюю скорость. Не утомляйте окружающих - выдернут из розетки. ",
                  " Знание сегодня стоит рассматривать как средство, а не как цель. Ваши навыки сегодня совершенствоваться не будут, даже если вы приложите к этому самые титанические усилия. ",
                  " Вы, подобно Летучему Голландцу, все время в пути, и почти всегда без определенной цели. Быть легким на подъем, конечно, неплохо, однако не настолько же легким, чтобы вас сносило малейшим дуновением ветерка. ",
                  " Сегодня вы будете очень деятельны, но вашей энергии хватит ненадолго. Расходуйте ее по возможности более экономно, иначе к вечеру вы будете просто валиться с ног. ",
                  " Сегодняшний день вам лучше провести на заднем плане. Пусть на ваше мнение никто не обращает внимания, зато и за последствия плохо продуманных действий отвечать придется не вам. ",
                  " Сегодня вам не подойдет ни один из стандартного набора действий в данной конкретной ситуации. Придется выдумывать что-то новое. ",
                  " Сегодня вас может одолеть нерешительность. Весьма раздражающее качество, но сейчас оно будет вашим союзником. Раз вы не можете на что-то решиться, значит тому есть причины, и стоит все еще раз хорошенько обдумать. ",
                  " Сегодняшний день просто идеален для всякого рода поездок. Вам довольно трудно будет усидеть на месте, и если никаких иных перемещений не ожидается, вы с большой степенью вероятности проведете этот день в беготне по этажам, коридорам, или, на худой конец, просто меряя шагами комнату. ",
                  " Сегодня вам лучше не искать компании, у вас могут появиться трудности в общении с себе подобными. Придется удовольствоваться обществом телевизора. ",
                  " Сегодня небольшое умственное усилие - и вы будете на коне. Осталось лишь додуматься, в каком именно направлении стоит предпринимать оный мозговой штурм. ",
                  " Сегодня мысли ваши будут возвышенны, а планы - далекоидущи. Постарайтесь не придать забвению ни тех, ни других, ибо они представляют собой немалую ценность, и вполне могут пригодиться вам в будущем. ",
                  " Лучший способ отдохнуть от тяжких последствий умственного труда - заняться физическим. Ну а если вам осточертело созидать - вряд ли кто-нибудь решится помешать вам начать разрушения. ",
                  " Сегодня вы сделаете большую ошибку, если хоть на йоту поддадитесь влиянию эмоций, неважно, собственных или чьих-то чужих. Вам понадобится очень холодная (не путать с простуженной!) голова. ",
                  " Сегодня вам будет необходимо понимание и поддержка. Обращаясь за ними к кому-нибудь, предварительно убедитесь, что избранник пребывает в хорошем настроении, в противном случае вы рискуете обменяться с ним ролями. ",
                  " Если захотите - можете проходить и сквозь стены, главное - видеть цель и верить в себя. Сегодня ничто не сможет стать преградой между вами и объектом ваших стремлений. ",
                  " Если жизнь от щедрот подкинула вам лимон, зачем есть его прямо так? Сделайте лимонад, и пускай вам завидуют менее удачливые обладатели более сладких и липких плодов. ",
                  " Попытайтесь все же понять, что именно сегодня следует сделать. В противном случае все, чего вы достигнете, исчезнет как дым, развеянный ветром. ",
                  " Если вы желаете выступить соло, подберите место и время правильно. Будет чрезвычайно обидно, если ваше выступление пройдет незамеченным. ",
                  " Сегодня вы будете заряжены гораздо большим количеством энергии, чем вам может понадобиться. Постарайтесь не употребить ее во вред собственному организму. ",
                  " Сегодня у вас появится реальная возможность уговорить тех, кто ранее уговорам не поддавался. Но сила убеждения - оружие обоюдоострое. При неаккуратном обращении можно уговорить на любое сколь угодно глупое действие самого себя. ",
                  " Сегодня вы будете непревзойденным специалистом по достижению невозможного. Только не перегрузите себя заказами. ",
                  " Сегодня как раз тот день, про который вы в последствии скажете \"Не было бы счастья, да несчастье помогло\". Что бы нынче ни случилось - хэппи энд вам обеспечен. ",
                  " Сегодня вам повезет в финансовом отношении и даже крупнее, чем вы могли бы рассчитывать. Но не затевайте долгоиграющих дел, удача мимолетна. ",
                  " Витающий в воздухе ветер перемен грозится задеть вас своим нежным крылышком. Постарайтесь не дать ему оторвать вас от земли. А то унесет еще в тридевятое царство. ",
                  " Сегодняшний день предоставит вам возможность быть беззаботным и доставит пару-тройку поводов для радости. Однако обязанностями все-таки пренебрегать не следует. ",
                  " Сегодня балом будет править оптимизм. (Если вы вдруг забыли, оптимист - это такой человек, который считает, что все может быть и хуже, когда любой другой полагает, что хуже уже некуда.) Следовательно, вам, чтобы не выделяться кислою миной, имеет смысл улыбнуться, и решить про себя, что не так уж все и плохо, а местами - даже хорошо. ",
                  " Сегодня вашу душу должно согреть сознание собственной нужности и незаменимости. Что еще нужно для счастья? ",
                  " Сегодняшний день должен быть довольно удачным, единственная опасность вашему благополучию - ваш собственный язык. Постарайтесь удержать его в рамках, иначе о нынешнем дне придется долго жалеть. ",
                  " Сегодня вы можете позволить себе пойти на риск, но только на оправданный. Однако, стоит иметь в виду, что, продемонстрировав свою решительность, вы завоюете положение лидера, хотите вы того, или нет. ",
                  " Взаимоотношения с близкими нынче теплы, но могут стать горячими и начать взрываться. Таким качеством как объективность вы сегодня похвастаться не можете. Не позволяйте излишней подозрительности испортить вам жизнь. ",
                  " Вам хочется и того, и другого, и третьего, и побольше. Однако, исходя из жизненного опыта человечества, получить все сразу не удастся. Выберите приоритетные направления. ",
                  " Сегодня вам достаточно будет прислушаться к голосу своей интуиции, чтобы с большой степенью точности определить, правы вы или нет. День этот будет тих и безмятежен до неприличия. ",
                  
                   };
    
        
    String zod[] = {"Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева", "Весы", "Скорпион", "Стрелец", "Козерог", "Водолей", "Рыбы"};
        
    JTextArea display;
    JLabel pic;
    public JLabel z;
    
        
    JButton button0 ;
    JButton button1 ;
    JButton button2 ;
    JButton button3 ;
    JButton button4 ;
    JButton button5 ;
    JButton button6 ;
    JButton button7 ;
    JButton button8 ;
    JButton button9 ;
    JButton button10 ;
    JButton button11 ;
    JMenuBar menubar ;
    JMenu option ;
    JMenuItem exit ;
    JMenu file ;
    JMenuItem save ;
    String r = "Уважаемый ";
    
    
    public Frame(){
        setSize(560,700);
        setResizable(false);
        setLayout( null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    display = new JTextArea();    
    pic = new JLabel ();
    z = new JLabel();
    button0 = new JButton(zod [0]);
    
    button1 = new JButton(zod [1]);
    button2 = new JButton(zod [2]);
    button3 = new JButton(zod [3]);
    button4 = new JButton(zod [4]);
    button5 = new JButton(zod [5]);
    button6 = new JButton(zod [6]);
    button7 = new JButton(zod [7]);
    button8 = new JButton(zod [8]);
    button9 = new JButton(zod [9]);
    button10 = new JButton(zod [10]);
    button11 = new JButton(zod [11]);
    menubar = new JMenuBar ();
    option = new JMenu("Option");
    exit = new JMenuItem ("Exit");
    file = new JMenu ("File");
    save = new JMenuItem ("Save");
         
    button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [0]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo0 = new ImageIcon("src/goroskop/0.png");
                pic.setIcon(logo0);
                
            }
        });
    button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               z.setText(zod [1]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo1 = new ImageIcon("src/goroskop/1.png");
                pic.setIcon(logo1);
                
            }
        });
    button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               z.setText(zod [2]);
                display.setText( td[ra.nextInt(td.length)]);
              ImageIcon logo2 = new ImageIcon("src/goroskop/2.png");
                pic.setIcon(logo2);
                
                
            }
        });
    button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [3]);
                display.setText( td[ra.nextInt(td.length)]);;
                ImageIcon logo3 = new ImageIcon("src/goroskop/3.png");
                pic.setIcon(logo3);
            }
        });
    button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [4]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo4 = new ImageIcon("src/goroskop/4.png");
                pic.setIcon(logo4);
            }
        });
    button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [5]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo5 = new ImageIcon("src/goroskop/5.png");
                pic.setIcon(logo5);
            }
        });
    button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [6]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo6 = new ImageIcon("src/goroskop/6.png");
                pic.setIcon(logo6);
            }
        });
    button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [7]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo7 = new ImageIcon("src/goroskop/7.png");
                pic.setIcon(logo7);
            }
        });
    button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [8]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo8 = new ImageIcon("src/goroskop/8.png");
                pic.setIcon(logo8);
            }
        });
    button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [9]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo9 = new ImageIcon("src/goroskop/9.png");
                pic.setIcon(logo9);
            }
        });
    button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [10]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo10 = new ImageIcon("src/goroskop/10.png");
                pic.setIcon(logo10);
            }
        });
    button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.setText(zod [11]);
                display.setText( td[ra.nextInt(td.length)]);
                ImageIcon logo11 = new ImageIcon("src/goroskop/11.png");
                pic.setIcon(logo11);
            }
        });
    exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    setJMenuBar(menubar);
    menubar.add(file,0,0);
    file.add(save);
    menubar.add(option);
    option.add(exit);
    
      
    int y = 30;
    int x = 80;
     
    z.setBounds(30, 200, 90, 40);
    pic.setBounds(230, 110, 100, 100);
    
    button0.setBounds(10, 10, x, y);
       
    button1.setBounds(100, 10, x, y);
    
    button2.setBounds(190, 10, x, y);
    
    button3.setBounds(280, 10, x, y);
    
    button4.setBounds(370, 10, x, y);
    
    button5.setBounds(460, 10, x, y);
    
    button6.setBounds(10, 60, x, y);
    
    button7.setBounds(100, 60, x, y);
    
    button8.setBounds(190, 60, x, y);
    
    button9.setBounds(280, 60, x, y);
    
    button10.setBounds(370, 60, x, y);
    
    button11.setBounds(460, 60, x, y);
   
    display.setBounds(10, 300, 535, 200);
    display.setEditable(false);
    display.setLineWrap(true);
    display.setWrapStyleWord(true);
    
    add(pic);
    add(button0);
    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);
    add(button6);
    add(button7);
    add(button8);
    add(button9);
    add(button10);
    add(button11);
    add(display);
    add(z);
    
    save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    FileWriter  f = new FileWriter("gor.doc");
                    f.write(" Гороскоп на сегодня для знака зодиака : " + z.getText());
                    f.write("\n" + "  "+display.getText());
                    f.close();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                   
                
                }
            
        });
    
                setVisible(true);
    }
   
    /**
     *
     * @throws IOException
     */
            // o.write(z.getText() + ":" + "/n" + display.getText() ); 
        
    
}
