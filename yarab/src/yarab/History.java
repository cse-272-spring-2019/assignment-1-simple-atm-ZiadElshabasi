package yarab;

public class History {
String [] hist= new String[5];
int i=0;String ziad;
public void hBalance() {
	if (i==4) {
		for (int j=1;j<4;j++) {hist[j-1]=hist[j];}
		hist[4]="balance inquiry";
}
	else {
	hist[i]="balance inquiry";
	i++;
	}
}
}
