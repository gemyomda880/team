package calcuu;
 import java.awt.GradientPaint;
import java.util.Stack;
import com.sun.javafx.cursor.CursorFrame;
import com.sun.javafx.cursor.CursorType;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;



 public class cal1 extends Application {
	 Stack<Integer>pracktise;
	 double d;
	 String Result="";
	 int counter=0;
	 DoubleProperty d1;
	 Stack<String>ss=new Stack<>();
	 String all="";
	 String s="";
	 public void start(Stage primaryStage) {
		
		 //style of design
		
		 
        BorderPane pp=new BorderPane();
      

		 GridPane pane = new GridPane();
		  pane.setPadding(new Insets(11.5, 12.5, 13.5, 16.5));
		  pane.setHgap(5.5);
		  pane.setVgap(5.5);
		
		  
		 
	     Button bt0 = new Button("0");
	     Button bt1 = new Button("1");
	     Button bt2 = new Button("2");
	     Button bt3 = new Button("3");
	     Button bt4 = new Button("4");
	     Button bt5 = new Button("5");
	     Button bt6 = new Button("6");
	     Button bt7 = new Button("7");
	     Button bt8 = new Button("8");
	     Button bt9 = new Button("9");
	    
	     
	     Button btmul = new Button  ("*");
	     Button btdiv = new Button  ("÷");
	     Button btmod = new Button  ("%");
	     Button btadd = new Button  ("+");
	     Button btsub = new Button  ("-");
	     Button btcoma = new Button (".");
	     Button btequal = new Button("=");
	     Button btb1 = new Button   ("(");
	     Button btb2 = new Button   (")");
	     Button btsquar = new Button("x2");
	     Button btentr = new Button ("←");
	     Button btsqrt = new Button ("√");
	     Button btdel = new Button  ("∆");
	     Button btprecent = new Button  ("p");
	     
	     
	     Button btsin=new Button  ("sin");
	     Button btcos=new Button  ("cos");
	     Button bttan=new Button  ("tan");
	     Button btc=new Button  ("C");
	     Button btrigth=new Button  ("R");
	     Button btleft=new Button  ("L");
	     
	     
	     
	     Button bte=new Button  ("e^");
	     Button btbi=new Button  ("π");
	     Button btfactorial=new Button  ("!");
	     Button btmeasure=new Button  ("|x|");
	     Button btlog=new Button  ("log");
	     Button btlin=new Button  ("lin");
	     
	     Button btstyle=new Button  ("style");
	     
	     
		 TextArea taNote = new TextArea();
		 taNote.setPrefColumnCount(20);
		 taNote.setPrefRowCount(3);
		 taNote.setWrapText(true);
		 taNote.setFont(Font.font(15));
		 taNote.setEditable(true);
		 
		 
		 
		 btequal.setStyle("-fx-background-color:green; ");		
		 btc.setStyle("-fx-background-color:red; ");	
		 btdel.setStyle("-fx-background-color:red; ");	
		 
		 
		 HBox h1=new HBox(5);
		 h1.getChildren().addAll(bt7,bt8,bt9,btsub);
		  
		 HBox h11=new HBox(5);
		 h11.getChildren().addAll(btleft,btrigth,btsquar);
		 
		 HBox h2=new HBox(5);
		 h2.getChildren().addAll(bt4,bt5,bt6,btadd);
		 
		 HBox h22=new HBox(5);
		 h22.getChildren().addAll(btsin,btcos,bttan);
		 
		 HBox h33=new HBox(5);
		 h33.getChildren().addAll(btlin,btlog,btsqrt);
		 
		 HBox h3=new HBox(5);
		 h3.getChildren().addAll(bt1,bt2,bt3,btmod);
		 
		 HBox h4=new HBox(5);
		 h4.getChildren().addAll(bt0,btcoma,btequal);
		 
		 HBox h44=new HBox(5);
		 h44.getChildren().addAll(btmeasure,btbi,bte);
		 
		 HBox h55=new HBox(5);
		 h55.getChildren().addAll(btb1,btb2,btentr); 
		 
		 HBox h5=new HBox(5);
		 h5.getChildren().addAll(btc,btdiv,btmul,btdel); 
		 
		GridPane g1=new GridPane();
		GridPane g11=new GridPane();
		g1.setHgap(5.5);
		g1.setVgap(5.5);
		g11.setHgap(5.5);
		g11.setVgap(5.5);
		
		 g11.add(h5, 0, 1);
		 g11.add(h1, 0, 2);
		 g11.add(h2, 0, 3);
		 g11.add(h3, 0, 4);
		 g11.add(h4, 0, 5);
		
		 g1.add(h55, 0, 1);
		 g1.add(h11, 0, 2);
		 g1.add(h22, 0, 3);
		 g1.add(h33, 0, 4);
		 g1.add(h44, 0, 5);
		
		 HBox hh=new HBox(40);	
		 hh.getChildren().addAll(g1,g11) ;
		 
		 
		 pane.add(btstyle,0,0);
		 pane.add(taNote, 0, 1);
		 pane.add(hh, 0, 2);
		//pane.add(h1, 0, 2);
		// pane.add(h2, 0, 3);
		// pane.add(h3, 0, 4);
		// pane.add(h4, 0, 5);
	 /*d1=new SimpleDoubleProperty(bt1.maxHeightProperty().getValue());
	 d=bt1.maxHeightProperty().getValue();
	bt1.maxHeightProperty().addListener(new InvalidationListener() {
		 public void invalidated(Observable ov) {
			 d=bt1.maxHeightProperty().getValue();
			 d1.setValue((pane.maxHeightProperty().getValue()-d)*(d/bt1.maxHeightProperty().getValue()));
		 }
			});
	
		 bt1.prefHeightProperty().bind(d1);*/
		 ///////////////////////////////
		 bte.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 bte.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btbi.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btbi.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btmeasure.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btmeasure.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btlin.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btlin.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btlog.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btlog.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btfactorial.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btfactorial.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 
		 
		 
		 
		 
		 
		 ///////////////////////////////
		 btsin.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsin.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btcos.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btcos.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bttan.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bttan.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btc.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btc.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btrigth.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btrigth.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btleft.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btleft.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt1.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt1.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 ////////////////////////taNote/////////////////////////////
		 
		 taNote.prefWidthProperty().bind(pane.widthProperty().subtract(50));
		  taNote.prefHeightProperty().bind(pane.heightProperty().multiply(1.0/4.0));
		 
		// taNote.maxWidthProperty().bind(primaryStage.widthProperty().subtract(50));
		//taNote.maxHeightProperty().bind(primaryStage.heightProperty().multiply(1.0/4.0));
        
		 /////////////////////////////////////////////////////
		 bt0.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt0.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt2.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt2.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
	     
		 bt3.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt3.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt4.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt4.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt5.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt5.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt6.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt6.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt7.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt7.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt8.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt8.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt9.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt9.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btb1.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btb1.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btb2.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btb2.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btmul.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btmul.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btdiv.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btdiv.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btsub.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsub.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btadd.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btadd.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btmod.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btmod.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btprecent.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btprecent.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btcoma.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btcoma.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btentr.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btentr.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btdel.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btdel.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btsquar.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsquar.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btsqrt.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsqrt.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btequal.prefWidthProperty().bind(btsqrt.prefWidthProperty().multiply(2));
		 btequal.prefHeightProperty().bind(btsqrt.prefHeightProperty());
		 ////////////////////////////////////////////////////////
		 
      	 
	
	     bt0.setOnAction(e->{
	    	  s="0";
	    	  ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt1.setOnAction(e->{
	    	  s="1";
	    	  ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt2.setOnAction(e->{
	    	  s="2"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });

	     bt3.setOnAction(e->{
	    	  s="3"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt4.setOnAction(e->{
	    	  s="4"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt5.setOnAction(e->{
	    	  s="5"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     bt6.setOnAction(e->{
	    	  s="6"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt7.setOnAction(e->{
	    	  s="7"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt8.setOnAction(e->{
	    	  s="8"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt9.setOnAction(e->{
	    	  s="9"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btmul.setOnAction(e->{
	    	  s="*"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btdiv.setOnAction(e->{
	    	  s="÷"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btmod.setOnAction(e->{
	    	  s="%"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btadd.setOnAction(e->{
	    	  s="+"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btsub.setOnAction(e->{
	    	  s="-"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btcoma.setOnAction(e->{
	    	  s="."; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btequal.setOnAction(e->{
	    	
	    	 if(check_pracktise(all)&&!isNumber(all))
	    	 {
	    		 Result=calculate_Expression(all);
	    		 taNote.setText(all+"\r\n"+" = "+Result);
	    	 }
	    	 else
	    		 taNote.setText(all+"\r\n"+" = "+"Invalid Expresion");
	     });
	     
	     
	     btb1.setOnAction(e->{
	    	  s="("; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btb2.setOnAction(e->{
	    	  s=")"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btsquar.setOnAction(e->{
	    	 s="^2"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btentr.setOnAction(e->{
	    	  s="\r\n"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btsqrt.setOnAction(e->{
	    	  s="√"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     
	     btdel.setOnAction(e->{
	    	 if(all.length()>0)
	    	 {
      	    	 all=all.substring(0, all.length()-ss.pop().length());
	         	 taNote.setText(all);
	    	 }
	    	 else 
	    		  taNote.setText("");
	     });
	     
	     
	     btsin.setOnAction(e->{
	    	  s="(sin"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btcos.setOnAction(e->{
	    	  s="(cos"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	      
	     
	     bttan.setOnAction(e->{
	    	  s="(tan"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	   
	     btc.setOnAction(e->{
	    	 all="";
	    	 taNote.setText(all);
	     });
	     
	     btrigth.setOnAction(e->{
	    	 
	     });
	     
	     
	     btleft.setOnAction(e->{
	    	 
	    	 
	     });
	     
	     bte.setOnAction(e->{
	    	 s="(e^"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btbi.setOnAction(e->{
	    	 s="π"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btmeasure.setOnAction(e->{
	    	 s="(abs"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btlin.setOnAction(e->{
	    	 s="(lin"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btlog.setOnAction(e->{
	    	 s="(log"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     btfactorial.setOnAction(e->{
	    	 s="(!"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btstyle.setOnAction(e->{
	    	 counter++;
	    	 
	    	 if(counter==1)
	    	 {
	    	 Application.setUserAgentStylesheet(getClass().getResource("app.css")
				       .toExternalForm());
	    	 btadd.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
	    	 btsub.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
	    	 btmod.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
	    	 btmul.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
	    	 btdiv.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
	    	 btc.setStyle("-fx-background-color:#03A9F4 ;-fx-text-fill: white");	
			 btdel.setStyle("-fx-background-color:#03A9F4;;-fx-text-fill: white ");
			 btcoma.setStyle("-fx-background-color:#03A9F4;;-fx-text-fill: white ");
			 
	    	 }
	    	 if(counter==2)
	    	 {
		    	 Application.setUserAgentStylesheet(getClass().getResource("app4.css")
					       .toExternalForm());
		    	 btadd.setStyle("-fx-background-color:orange");
		    	 btsub.setStyle("-fx-background-color:orange");
		    	 btmod.setStyle("-fx-background-color:orange");
		    	 btmul.setStyle("-fx-background-color:orange");
		    	 btdiv.setStyle("-fx-background-color:orange");
		    	 btc.setStyle("-fx-background-color:#F64C22; ");	
				 btdel.setStyle("-fx-background-color:#F64C22; ");	
				 btequal.setStyle("-fx-background-color:orange");
				 btcoma.setStyle("-fx-background-color:orange");
		    	 
	    	 }
	    	 
	    	 if(counter==3)
	    	 {
		    	 Application.setUserAgentStylesheet(getClass().getResource("app3.css")
					       .toExternalForm());
		    	 
		    	 btequal.setStyle("-fx-background-color:#48EA8E;"
		    	 		+ "-fx-background-radius: 15em; ");		
		    	 btc.setStyle("-fx-background-color:red;"+ "-fx-background-radius: 15em;");	
		    	 btdel.setStyle("-fx-background-color:red; ");
		    
		    	 btadd.setStyle("-fx-background-color:#4DA3C3");
		    	 btsub.setStyle("-fx-background-color:#4DA3C3");
		    	 btmod.setStyle("-fx-background-color:#4DA3C3");
		    	 btmul.setStyle("-fx-background-color:#4DA3C3");
		    	 btdiv.setStyle("-fx-background-color:#4DA3C3");
		    	 btc.setStyle("-fx-background-color:#4DA3C3; ");	
				 btdel.setStyle("-fx-background-color:#4DA3C3 ");
				 btcoma.setStyle("-fx-background-color:#4DA3C3; ");
		    	 
	    	 }
	    	 
	    	 if(counter==4)
	    	 {
		    	 Application.setUserAgentStylesheet(getClass().getResource("app2.css")
					       .toExternalForm());
		    	 btadd.setStyle("-fx-background-color:black;-fx-text-fill:white");
		    	 btsub.setStyle("-fx-background-color:black;-fx-text-fill:white");
		    	 btmod.setStyle("-fx-background-color:black;-fx-text-fill:white");
		    	 btmul.setStyle("-fx-background-color:black;-fx-text-fill:white");
		    	 btdiv.setStyle("-fx-background-color:black;-fx-text-fill:white");
		    	 btc.setStyle("-fx-background-color:black;-fx-text-fill:white");	
				 btdel.setStyle("-fx-background-color:black;-fx-text-fill:white");
				 btcoma.setStyle("-fx-background-color:black;-fx-text-fill:white");
				 
		   
	    	 }
	    	 if(counter==5)
	    	 {
	    		 Application.setUserAgentStylesheet(getClass().getResource("app5.css")
					       .toExternalForm());
	    		 btadd.setStyle("-fx-background-color:#666666");
		    	 btsub.setStyle("-fx-background-color:#666666");
		    	 btmod.setStyle("-fx-background-color:#666666");
		    	 btmul.setStyle("-fx-background-color:#666666");
		    	 btdiv.setStyle("-fx-background-color:#666666");
		    	 btc.setStyle("-fx-background-color:#666666; ");	
				 btdel.setStyle("-fx-background-color:#666666; ");
				 btcoma.setStyle("-fx-background-color:#666666; ");
				 
				 bt0.setStyle("-fx-background-color:#4C4C4C; ");
				 bt1.setStyle("-fx-background-color:#4C4C4C; ");
				 bt2.setStyle("-fx-background-color:#4C4C4C; ");
				 bt3.setStyle("-fx-background-color:#4C4C4C; ");
				 bt4.setStyle("-fx-background-color:#4C4C4C; ");
				 bt5.setStyle("-fx-background-color:#4C4C4C; ");
				 bt6.setStyle("-fx-background-color:#4C4C4C; ");
				 bt7.setStyle("-fx-background-color:#4C4C4C; ");
				 bt8.setStyle("-fx-background-color:#4C4C4C; ");
				 bt9.setStyle("-fx-background-color:#4C4C4C; ");
				 
		    	 counter=0;
	    	 }
	    	 
	     });
	     
	     
	      //pane.setStyle("-fx-border-width:7px");
		  Scene scene = new Scene( pane ,300, 300);
		   // scene.getStylesheets().add("app.css");
		  // pane.prefHeightProperty().bind(scene.xProperty());
		 //pane.prefWidthProperty().bind(scene.yProperty());
		  primaryStage.setTitle("Taschenrechener"); 
		  primaryStage.setScene(scene); 
		  primaryStage.show(); 
		 
	 }
	 public  boolean is_symbol(char c)
	 {
		 switch (c) {
		case '+':
			return true;
		case '-':
			return true;

        case '*':
        	return true;
        case '÷':
        	return true;
        case '%':
        	return true;
       case '√':
    	   return true;
    	   
      /* case 's':
    	   return true;
    	   
       case 't':
    	   return true;
    	   
       case 'c':
    	   return true;*/
    	   
       case '^':
    	   return true;
        default:
        	return false;
		}
	 }
	  
 
	 
	 public boolean check_pracktise(String s)
	 {
		 int index1 = s.indexOf("("),index2= s.indexOf(")");
		pracktise=new Stack<>();
		 pracktise.push(index1);
		 int c1 = 0 , c2 = 0;
	    while(index1!=-1)
	    {
	    	c1++;
	    	index1=s.indexOf("(",index1+1);
	    	pracktise.push(index1);
	    } 
	    
	    while(index2!=-1)
	    {
	    	c2++;
	    	index2=s.indexOf(")",index2+1);
	    } 
	   
	    pracktise.pop();
	    
	    if(c1==c2)
	    	return true;
	    else
	    	return false;
	    
	 }
	 
	 /*public int[] getIndexForPracktise(String s) {
		 int[] indces=new int[2];
		 int post,pre;
		 indces[0]=s.indexOf("(0");
		  pre=s.indexOf(")");
		  post=pre;
		  while(pre!=-1)
		  {   
			  post=pre;
			  pre=s.indexOf(")");
			 
		  }
		
		  indces[1]=0;
		return indces;
	}*/
	
	public int[] getIndexFor_Op(String s,int op) { //op index for operation
		int post = 0,pre=0;
		int[]indces=new int[2];
		char[] Ex=s.toCharArray();
		for(int i=op+1;i<Ex.length;i++)
			if(!is_symbol(Ex[i]))
				post++;
			else if(Ex[i]=='-'&&is_symbol(Ex[i-1]))// for a negative number
				post++;
			else
				break;
		for(int i=op-1;i>=0;i--)
			if(!is_symbol(Ex[i]))
				pre++;
			else if(Ex[i]=='-'&&i==0)
				pre++;
			else if(Ex[i]=='-'&&is_symbol(Ex[i-1]))
				pre++;
			else
				break;
		indces[1]=op+post;
		indces[0]=op-pre;
		return indces;
	}  
	
	public String calculate_operation(StringBuffer sb , int[] index) {
		math_op operation=new math_op((sb.substring(index[0], index[1]+1)).toString());
		sb.replace(index[0], index[1]+1, String.valueOf(operation.result));
		return sb.toString();
	}
	
	 public String calculate_Expression(String s)
	{
	  while(!isNumber(s)) {
		 if(s.contains("(")&&s.contains(")"))
		 {
			 int i=pracktise.pop();
			 String str=s.substring(i+1, s.indexOf(")",i));
			 StringBuffer sb=new StringBuffer(s);
			 sb.replace(i, s.indexOf(")",i)+1, calculate_Expression(str));
			 s=sb.toString();
		 }
		else if(s.contains("tan"))
	    	{
	    	    math_op operation=new math_op(s);
	    	    return String.valueOf(operation.result); 
	    	}
	    else if(s.contains("sin"))
	    	{
	    	 math_op operation=new math_op(s);
	    	    return String.valueOf(operation.result); 
	    
	    	}
	    else if(s.contains("cos"))
	    	{
	    	 math_op operation=new math_op(s);
	    	    return String.valueOf(operation.result); 
	    	
	    	}
	    else if(s.contains("^2"))
	    	{
	    		s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("^") ));
	    	}
	    else if(s.contains("√"))
	    	{
	    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("√") ));
	    	}
	    	
		 else if(s.contains("*"))
	    	{
		    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("*") ));

	    	}
	    else if(s.contains("÷"))
	    	{
	    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("÷") ));

	    	}
	    else if(s.contains("%"))
	    	{
	    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("%") ));

	    	}
	    
	    else if(s.contains("+"))
	    	{
	    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("+") ));

	    	}
	    else if(s.contains("-"))
	    	{
	    	  if(!isNumber(s))
	    	     s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("-") ));
	    	  else
	    		  return s;

	    	}
	  }
	   /*if(!isNumber(s))
	    	 return calculate_Expression(s);
	    else
		    return s ;*/
        return s;	 
	  
		}

	 public boolean isNumber(String s) {
		 
		 try{
			Double.parseDouble(s);
			 return true;
			}catch(NumberFormatException e)
		 {return false;}

	} 
/* public boolean isNagative(String s) {
		 
		 try{
			Double.parseDouble(s.substring(1, s.length()));
			 return true;
			}catch(NumberFormatException e)
		 {return false;}

	} */
	
	 public static void main(String[] args){
		  Application.launch(args);
		  
	 }
}

