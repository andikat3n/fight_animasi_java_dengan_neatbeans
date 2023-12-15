/*
 * cFrmMain.java
 *
 * Created on October 19, 2023, 9:30 AM
 */

package fightanimasi;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



/**
 *
 * @author  LAB202UCM
 */
public class cFrmMain extends javax.swing.JFrame {
    final int ScreenWidth=800, ScreenHeight=600;
    
    BufferedImage Back, Process, Karateka[][]=new BufferedImage[12][5];
    int MaxSpr[]={3,5,5,3,1,1,5,5,2,2,5,5}, SprPose, SprNo, x,y, xSpr, ySpr, Warna;
    String Path="C:\\netbeans\\fightanimasi\\KarateImages\\";
    Thread Timer;
    
    /** Creates new form cFrmMain */
    public cFrmMain() {
        File f;
        initComponents();
        setSize(ScreenWidth, ScreenHeight);
        
        f=new File(Path+"Back.jpg");
        try {Process=ImageIO.read(f);} catch(IOException ex){}
        
       f=new File(Path+"Back.jpg");
        try {Back=ImageIO.read(f);} catch(IOException ex){}
       
       //berdiri
       f=new File(Path+"Stand0.bmp");
        try {Karateka [0][0]=ImageIO.read(f);} catch(IOException ex){}
       
       f=new File(Path+"Stand1.bmp");
         try {Karateka [0][1]=ImageIO.read(f);} catch(IOException ex){}
       
       f=new File(Path+"Stand2.bmp");
        try {Karateka [0][2]=ImageIO.read(f);} catch(IOException ex){}
       
       //tendangan kaki kanan ke atas
       f=new File(Path+"RightKick0.bmp");
         try {Karateka [1][0]=ImageIO.read(f);} catch(IOException ex){}
       
       f=new File(Path+"RightKick1.bmp");
        try {Karateka [1][1]=ImageIO.read(f);} catch(IOException ex){}
       
       f=new File(Path+"RightKickHigh.bmp");
         try {Karateka [1][2]=ImageIO.read(f);} catch(IOException ex){}
       
       f=new File(Path+"RightKick1.bmp");
        try {Karateka [1][3]=ImageIO.read(f);} catch(IOException ex){}
       
       f=new File(Path+"RightKick0.bmp");
         try {Karateka [1][4]=ImageIO.read(f);} catch(IOException ex){}
       
     //tendangan kaki kanan kebawah
         f=new File(Path+"RightKick0.bmp");
         try {Karateka [2][0]=ImageIO.read(f);} catch(IOException ex){}
         
         f=new File(Path+"RightKick1.bmp");
         try {Karateka [2][1]=ImageIO.read(f);} catch(IOException ex){}
         
         f=new File(Path+"RightKickLow.bmp");
         try {Karateka [2][2]=ImageIO.read(f);} catch(IOException ex){}
         
         f=new File(Path+"RightKick1.bmp");
         try {Karateka [2][3]=ImageIO.read(f);} catch(IOException ex){}
            
         f=new File(Path+"RightKick0.bmp");
         try {Karateka [2][4]=ImageIO.read(f);} catch(IOException ex){}
         
       //pukul tengah  
         f=new File(Path+"Punch.bmp");
         try {Karateka [3][0]=ImageIO.read(f);} catch(IOException ex){}
         
         f=new File(Path+"PunchMid.bmp");
         try {Karateka [3][1]=ImageIO.read(f);} catch(IOException ex){}
         
         f=new File(Path+"Punch.bmp");
         try {Karateka [3][2]=ImageIO.read(f);} catch(IOException ex){}
         
       
       //Blok bawah
         f=new File(Path+"BlockLow.bmp");
         try {Karateka [4][0]=ImageIO.read(f);} catch(IOException ex){}
         
         //Blok atas
        f=new File(Path+"BlockHigh.bmp");
         try {Karateka [5][0]=ImageIO.read(f);} catch(IOException ex){}
         
        //Tendangan kaki kiri ke atas
         f=new File(Path+"LeftKick0.bmp");
         try {Karateka [6][0]=ImageIO.read(f);} catch(IOException ex){}
         
           f=new File(Path+"LeftKick1.bmp");
         try {Karateka [6][1]=ImageIO.read(f);} catch(IOException ex){}
        
         f=new File(Path+"LeftKickHigh.bmp");
         try {Karateka [6][2]=ImageIO.read(f);} catch(IOException ex){}
         
          f=new File(Path+"LeftKick1.bmp");
         try {Karateka [6][3]=ImageIO.read(f);} catch(IOException ex){}
          
           f=new File(Path+"LeftKick0.bmp");
         try {Karateka [6][4]=ImageIO.read(f);} catch(IOException ex){}
        
        
       //tendangan kaki kanan tengah
          f=new File(Path+"RightKick0.bmp");
         try {Karateka [7][0]=ImageIO.read(f);} catch(IOException ex){}
          
          f=new File(Path+"RightKick1.bmp");
         try {Karateka [7][1]=ImageIO.read(f);} catch(IOException ex){}
       
          f=new File(Path+"RightKickMid.bmp");
         try {Karateka [7][2]=ImageIO.read(f);} catch(IOException ex){}
        
          f=new File(Path+"RightKick1.bmp");
         try {Karateka [7][3]=ImageIO.read(f);} catch(IOException ex){}
       
            f=new File(Path+"RightKick0.bmp");
         try {Karateka [7][4]=ImageIO.read(f);} catch(IOException ex){}
          
        //pukul bawah
          f= new File (Path+"Punch.bmp");
          try{Karateka [8][0]=ImageIO.read(f);} catch (IOException ex){}
          
          f=new File (Path+ "PunchLow.bmp");
          try {Karateka [8][1]=ImageIO.read(f);} catch (IOException ex ){}
         
          //pukul atas
           f= new File (Path+"Punch.bmp");
          try{Karateka [9][0]=ImageIO.read(f);} catch (IOException ex){}
           
          f=new File (Path +"PunchHigh.bmp");
          try{Karateka [9][1]=ImageIO.read(f);} catch (IOException ex ) {}
          
          //tendangan kaki kiri bawah
          f= new File (Path +"LeftKick0.bmp");
          try{Karateka [10][0]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKick1.bmp");
          try{Karateka [10][1]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKickLow.bmp");
          try{Karateka [10][2]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKick1.bmp");
          try{Karateka [10][3]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKick0.bmp");
          try{Karateka [10][4]=ImageIO.read(f);} catch (IOException ex){}
          
          
         //tendangan kaki kiri tengah 
           f= new File (Path +"LeftKick0.bmp");
          try{Karateka [11][0]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKick1.bmp");
          try{Karateka [11][1]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKickMid.bmp");
          try{Karateka [11][2]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKick1.bmp");
          try{Karateka [11][3]=ImageIO.read(f);} catch (IOException ex){}
          
          f= new File (Path +"LeftKick0.bmp");
          try{Karateka [11][4]=ImageIO.read(f);} catch (IOException ex){}
          
       SprPose=0;
       SprNo=0;
       xSpr=100;
       ySpr=400;
       
       Timer=new Thread(new Runnable()
       {
        @Override
        public void run(){
            //tutup layar dengan background
            while (!Thread.interrupted()){
               for(y=0; y<Back.getHeight();y++ )
                for (x=0; x<Back.getWidth();x++)
                    Process.setRGB(x, y, Back.getRGB(x, y));
                
                //meletakan sprite karateka
                for(y=0;y<Karateka[SprPose][SprNo].getHeight();y++)
                    for(x=0; x<Karateka[SprPose][SprNo].getWidth();x++){
                        Warna=Karateka[SprPose][SprNo].getRGB(x, y);
                        if(Warna!=-16777216)
                            Process.setRGB(xSpr+x, ySpr+y, Warna);
                    }
                try{
                    Thread.sleep(50);
                }catch (Exception ex) {}
            /*if (SprPose>=3 && SprPose<12){
                SprNo++;
                if(SprNo>=MaxSpr[SprPose]){
                    SprPose=0;
                    SprNo=0;
                }
            }else if (SprPose==0){
                SprNo++;
                if(SprNo>=MaxSpr[SprPose])SprNo=0;
            }*/
         
             switch (SprPose) {
                 case 0: 
                     SprNo++;
                     if (SprNo>=3) SprNo=0;
                     break;
                     
                 case 1:
                     SprNo++;
                     if (SprNo>=5) {
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                 case 2:
                     SprNo++;
                     if(SprNo>=5){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                     case 3:
                     SprNo++;
                     if(SprNo>=3){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                     case 4:
                     SprNo++;
                     if(SprNo>=1){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                 case 5:
                     SprNo++;
                     if(SprNo>=1){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                 case 6:
                     SprNo++;
                     if(SprNo>=5){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                 case 7:
                     SprNo++;
                     if(SprNo>=5){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                    case 8:
                         SprNo++;
                         if(SprNo>=2){
                             SprPose=0;
                             SprNo=0;
                         }
                      break;
                 case 9:
                     SprNo++;
                     if(SprNo>=2){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                 case 10:
                     SprNo++;
                     if(SprNo>=5){
                         SprPose=0;
                         SprNo=0;
                     }
                     break;
                 case 11:
                     SprNo++;
                     if(SprNo>=5){
                         SprPose=0;
                         SprNo=0;
                     }
             }
                
               
                
                repaint();
                        
        }
        
    }
       });
       Timer.start();
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(Process, 0, 0, null);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    if (SprPose==0)    switch(evt.getKeyChar()){
            case 27:
                Timer.suspend();
                dispose();
                
            
         
           
                
        }
    switch (evt.getKeyChar()){
        case 'b':
                SprPose=1; SprNo=0; break;//tendangan kaki kanan ke atas
       
        case 'c':SprPose=2; SprNo=0; break; //tendangan kaki kanan kebawah
        case 's': SprPose=0; SprNo=0; break;
        case 'x': SprPose=3; SprNo=0; break; //pukul tengah 
        case 'z': SprPose=4; SprNo=0; break;//Blok bawah
        case 'v': SprPose=5; SprNo=0;break;//Blok atas
        case 'm': SprPose=6; SprNo=0;break;//Tendangan kaki kiri ke atas
        case 'n': SprPose=7; SprNo=0;break;//tendangan kaki kanan tengah
        case 'a': SprPose=8; SprNo=0;break;//pukul bawah
        case 'd': SprPose=9; SprNo=0;break;//pukul atas
        case 'f': SprPose=10; SprNo=0;break;//tendangan kaki kiri bawah
        case 'g': SprPose=11; SprNo=0;break;//tendangan kaki kiri tengah 
    }
    }//GEN-LAST:event_formKeyTyped

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        switch (evt.getKeyCode()){
            case 37: if (xSpr>10) xSpr-=10; break;
            case 39: if (xSpr<Process.getWidth()- Karateka[SprPose][SprNo].getWidth()-10)
                xSpr+=10;
               
        }
    }//GEN-LAST:event_formKeyReleased
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cFrmMain().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
};
