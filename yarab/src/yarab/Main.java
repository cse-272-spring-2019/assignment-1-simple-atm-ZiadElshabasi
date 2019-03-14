package yarab;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.xml.bind.ParseConversionEvent;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Main  extends Application{
	Stage window;
	GridPane grid1=new GridPane();
	int x;String s=new String();
	double dep1;String dep=new String();
	double with1;
	String with =new String();
	//String b=new String();
	Scene scene1=new Scene(grid1);
	AlertBox alertBox= new AlertBox();
	Account account=new Account();
	String [] hist= new String[5];
	String [] hist2= new String[5];
	int i=0;int y=0;
	
	public static void main(String[] args) {
		launch(args);
	}
	  @Override
	    public void start(Stage primaryStage) throws Exception {
		
			Stage window = primaryStage;
			
			//////Scene1//////////////
			// Label
			Label userIdLabel = new Label();
			userIdLabel.setText("Card Number");
			
			
			Label pinLabel = new Label();
			pinLabel.setText(s);
			
			// Button
			Button submit = new Button();
			submit.setText("submit");
			  Button del =new Button("del");
			  Button B1 =new Button("1");
			  Button B2 =new Button("2");
			  Button B3 =new Button("3");
			  Button B4 =new Button("4");
			  Button B5 =new Button("5");
			  Button B6 =new Button("6");
			  Button B7 =new Button("7");
			  Button B8 =new Button("8");
			  Button B9 =new Button("9");
			  Button B0 =new Button("0");
			
			
			// GridPane
			GridPane grid1 = new GridPane();
			GridPane.setConstraints(submit , 4 ,3);
			GridPane.setConstraints(userIdLabel , 3 ,0);
			GridPane.setConstraints(pinLabel , 1 ,0);
			GridPane.setConstraints(pinLabel,3,1);
			GridPane.setConstraints(B1,0,0);
			GridPane.setConstraints(B2,1,0);
			GridPane.setConstraints(B3,2,0);
			GridPane.setConstraints(B4,0,1);
			GridPane.setConstraints(B5,1,1);
			GridPane.setConstraints(B6,2,1);
			GridPane.setConstraints(B7,0,2);
			GridPane.setConstraints(B8,1,2);
			GridPane.setConstraints(B9,2,2);
			GridPane.setConstraints(B0,1,3);
			GridPane.setConstraints(del,2,3);
			grid1.getChildren().addAll(submit , del , B0 , B1 , B2 , B3 , B4 , B5 , B6 , B7 , B8 , B9 , userIdLabel , pinLabel);
			B0.setOnAction(e->{s=s+"0";pinLabel.setText(s);;});
			  B1.setOnAction(e->{s=s+"1";pinLabel.setText(s);});
			  B2.setOnAction(e->{s=s+"2";pinLabel.setText(s);});
			  B3.setOnAction(e->{s=s+"3";pinLabel.setText(s);});
			  B4.setOnAction(e->{s=s+"4";pinLabel.setText(s);});
			  B5.setOnAction(e->{s=s+"5";pinLabel.setText(s);});
			  B6.setOnAction(e->{s=s+"6";pinLabel.setText(s);});
			  B7.setOnAction(e->{s=s+"7";pinLabel.setText(s);});
			  B8.setOnAction(e->{s=s+"8";pinLabel.setText(s);});
			  B9.setOnAction(e->{s=s+"9";pinLabel.setText(s);});
			  del.setOnAction(e->{StringBuffer sb=new StringBuffer(s);
		sb.deleteCharAt(sb.length()-1);
		s= new String(sb);
		pinLabel.setText(s);
		});
			// Scene
			primaryStage.setTitle("Atm");
			Scene scene1 = new Scene(grid1, 600 ,400);
			window.setScene(scene1);
			window.show();
			/////////////////////////////////////
			
			//////Scene2//////////////
			//buttons
			Button withdraw = new Button();
			withdraw.setText("withdraw");
			Button deposit =new Button();
			deposit.setText("deposit");
			Button balanceInquiry =new Button();
			balanceInquiry.setText("balanceInquiry");
			Label history =new Label();
			history.setText(hist[y]);
			Label history2 =new Label();
			history2.setText(hist2[y]);
			Button previous =new Button();
			previous.setText("previous");
			Button next =new Button();
			next.setText("next");
			
			//grid
			GridPane grid2= new GridPane();
			GridPane.setConstraints(deposit , 0 ,0);
			GridPane.setConstraints(withdraw , 0 , 1);
			GridPane.setConstraints(balanceInquiry , 0 ,2);
			GridPane.setConstraints(history , 2 ,5);
			GridPane.setConstraints(history2 , 3 ,5);
			GridPane.setConstraints(previous , 0 ,4);
			GridPane.setConstraints(next , 1 ,4);
			grid2.getChildren().addAll(deposit ,withdraw ,balanceInquiry ,history ,history2,previous ,next);
			
			//scene
			Scene scene2 = new Scene(grid2, 400 ,400);
	
		//////Scene deposit//////////////
					Button submit2 = new Button();
					submit2.setText("submit");
					Label depLabel= new Label();
					depLabel.setText(dep);
					  Button dot =new Button(" .");
					  Button dele =new Button("del");
					  Button B11 =new Button("1");
					  Button B22 =new Button("2");
					  Button B33 =new Button("3");
					  Button B44 =new Button("4");
					  Button B55 =new Button("5");
					  Button B66 =new Button("6");
					  Button B77 =new Button("7");
					  Button B88 =new Button("8");
					  Button B99 =new Button("9");
					  Button B00 =new Button("0");
					  Button back2 =new Button("back");
					
					
					// GridPane
					GridPane grid3 = new GridPane();
					GridPane.setConstraints(submit2 , 4 ,3);
					GridPane.setConstraints(depLabel,3,1);
					GridPane.setConstraints(B11,0,0);
					GridPane.setConstraints(B22,1,0);
					GridPane.setConstraints(B33,2,0);
					GridPane.setConstraints(B44,0,1);
					GridPane.setConstraints(B55,1,1);
					GridPane.setConstraints(B66,2,1);
					GridPane.setConstraints(B77,0,2);
					GridPane.setConstraints(B88,1,2);
					GridPane.setConstraints(B99,2,2);
					GridPane.setConstraints(B00,1,3);
					GridPane.setConstraints(dele,2,3);
					GridPane.setConstraints(back2,3,4);
					GridPane.setConstraints(dot,0,3);
					grid3.getChildren().addAll(submit2 ,back2 , dot , dele , B00 , B11 , B22 , B33 , B44 , B55 , B66 , B77 , B88 , B99 , depLabel);
					B00.setOnAction(e->{dep=dep+"0";if (dep.charAt(0)=='0') { dep="";}depLabel.setText(dep);;});
					  B11.setOnAction(e->{dep=dep+"1";depLabel.setText(dep);});
					  B22.setOnAction(e->{dep=dep+"2";depLabel.setText(dep);});
					  B33.setOnAction(e->{dep=dep+"3";depLabel.setText(dep);});
					  B44.setOnAction(e->{dep=dep+"4";depLabel.setText(dep);});
					  B55.setOnAction(e->{dep=dep+"5";depLabel.setText(dep);});
					  B66.setOnAction(e->{dep=dep+"6";depLabel.setText(dep);});
					  B77.setOnAction(e->{dep=dep+"7";depLabel.setText(dep);});
					  B88.setOnAction(e->{dep=dep+"8";depLabel.setText(dep);});
					  B99.setOnAction(e->{dep=dep+"9";depLabel.setText(dep);});
					  dot.setOnAction(e->{dep=dep+".";depLabel.setText(dep);});
					  dele.setOnAction(e->{StringBuffer sb=new StringBuffer(dep);
						sb.deleteCharAt(sb.length()-1);
						dep= new String(sb);
						depLabel.setText(dep);
						});
					  //scene
						Scene sceneDep = new Scene(grid3, 600 ,400);
						
					//////Scene withdraw//////////////
					Button submit3 = new Button();
					submit3.setText("submit");
					Label withdrawLabel= new Label();
					withdrawLabel.setText(with);
					Button del3 =new Button("del");
					Button B111 =new Button("1");
					Button B222 =new Button("2");
				    Button B333 =new Button("3");
					Button B444 =new Button("4");
					Button B555 =new Button("5");
					Button B666 =new Button("6");
					Button B777 =new Button("7");
					Button B888 =new Button("8");
					Button B999 =new Button("9");
					Button B000 =new Button("0");
					Button dot3 =new Button(" .");
					Button back3 =new Button("back");
					
					// GridPane
					GridPane grid4 = new GridPane();
					GridPane.setConstraints(submit3 , 4 ,3);
					GridPane.setConstraints(withdrawLabel,3,1);
					GridPane.setConstraints(B111,0,0);
					GridPane.setConstraints(B222,1,0);
					GridPane.setConstraints(B333,2,0);
					GridPane.setConstraints(B444,0,1);
					GridPane.setConstraints(B555,1,1);
					GridPane.setConstraints(B666,2,1);
					GridPane.setConstraints(B777,0,2);
					GridPane.setConstraints(B888,1,2);
					GridPane.setConstraints(B999,2,2);
					GridPane.setConstraints(B000,1,3);
					GridPane.setConstraints(del3,2,3);
					GridPane.setConstraints(back3,3,4);
					GridPane.setConstraints(dot3,0,3);
					grid4.getChildren().addAll(submit3 , back3 ,dot3, del3 , B000 , B111 , B222 , B333 , B444 , B555 , B666 , B777 , B888 , B999 , withdrawLabel);
					B000.setOnAction(e->{with=with+"0";if (with.charAt(0)=='0') { with="";}withdrawLabel.setText(with);});
					  B111.setOnAction(e->{with=with+"1";withdrawLabel.setText(with);});
					  B222.setOnAction(e->{with=with+"2";withdrawLabel.setText(with);});
					  B333.setOnAction(e->{with=with+"3";withdrawLabel.setText(with);});
					  B444.setOnAction(e->{with=with+"4";withdrawLabel.setText(with);});
					  B555.setOnAction(e->{with=with+"5";withdrawLabel.setText(with);});
					  B666.setOnAction(e->{with=with+"6";withdrawLabel.setText(with);});
					  B777.setOnAction(e->{with=with+"7";withdrawLabel.setText(with);});
					  B888.setOnAction(e->{with=with+"8";withdrawLabel.setText(with);});
					  B999.setOnAction(e->{with=with+"9";withdrawLabel.setText(with);});
					  dot3.setOnAction(e->{with=with+".";depLabel.setText(with);});
					  del3.setOnAction(e->{StringBuffer sb=new StringBuffer(with);
						sb.deleteCharAt(sb.length()-1);
						with= new String(sb);
						withdrawLabel.setText(with);
						});
					//scene
						Scene sceneWithdraw = new Scene(grid4, 600 ,400);	
		
					//////Scene balanceInquiry//////////////
						Label balance=new Label();
						balance.setText(String.valueOf(account.getBalance()));
						Label format=new Label();
						format.setText("Your balance is:");
						Button back4= new Button();
						back4.setText("back");
						
						// GridPane
						GridPane grid5 = new GridPane();
						GridPane.setConstraints(format , 0 ,0);
						GridPane.setConstraints(balance , 1 ,0);
						GridPane.setConstraints(back4 , 0 ,1);
						grid5.getChildren().addAll( format , balance , back4 );
						
						//scene
						Scene sceneBalanceInquiry = new Scene(grid5, 600 ,400);	
			//action
		  submit.setOnAction(e->{
			  if (account.getId().equals(s)) {
				  window.setScene(scene2);
			  System.out.println("hi there");}
			  else alertBox.display("Error","please Enter the correct Card Number");
		  	}
		  );
		  deposit.setOnAction(e->window.setScene(sceneDep));
		  
		  submit2.setOnAction(e->{double dep1 = Double.parseDouble(dep);
		  account.doDeposit(dep1);deposit();
		  window.setScene(scene2);});
		  
		  withdraw.setOnAction(e->window.setScene(sceneWithdraw));
		  
		  submit3.setOnAction(e->{double with1 = Double.parseDouble(with);
		  account.withdraw(with1);
		  if(with1>account.getBalance()) ;
		  else if (with1==0);
		  else withdraw();
		  });
		  
		  withdraw.setOnAction(e->window.setScene(sceneWithdraw));
		  
		  balanceInquiry.setOnAction(e->{balance();
		  				balance.setText(String.valueOf(account.getBalance()));
		  				window.setScene(sceneBalanceInquiry);});
		  
		  back4.setOnAction(e->window.setScene(scene2));
		  
		  back2.setOnAction(e->window.setScene(scene2));
		  
		  back3.setOnAction(e->window.setScene(scene2));

		  previous.setOnAction(e->{++y;if(y==5) {alertBox.display("Error","no more history to show");} else {history.setText(hist[y]);history2.setText(hist2[y]);}});
		  
		 next.setOnAction(e->{--y;if(y==-1) {alertBox.display("Error","no more history to show");}else {history.setText(hist[y]);history2.setText(hist2[y]);}});
		  
		  /////////////////////////////////////////////////////////////////////
		  ////////////	methods		//////////////////
		 
		  
}
public void balance() {
		for (int j=4;j>0;j--) {hist[j]=hist[j-1];hist2[j]=hist2[j-1];}
		hist[0]="balance inquiry";hist2[0]=String.valueOf(account.getBalance());
}

public void withdraw() {
	for (int j=4;j>0;j--) {hist[j]=hist[j-1];hist2[j]=hist2[j-1];}
		hist[0]="withdraw";hist2[0]=with;
			  }
public void deposit() {
	for (int j=4;j>0;j--) {hist[j]=hist[j-1];hist2[j]=hist2[j-1];}
		hist[0]="deposit";hist2[0]=dep;
			  }

	  }