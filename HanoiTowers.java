package Hanoi;

public class HanoiTowers {
	
	public static Tower towerA = new Tower ();
	public static Tower towerB = new Tower ();
	public static Tower towerC = new Tower ();


public static  void main (String [] args){
	
   

	int nDiscs = 0;
	do
	{
		nDiscs = readInt ("Numero de discos = ");
	}while (nDiscs <= 0 || nDiscs > 10);
	
	
	printf("-------------------------------------------\n");
	printf("|Torres de Hanói|\n");
	printf("|Números de Discos\n = 2d|");
	printf("-------------------------------------------\n");
	printf("|Torre A Torre B Torre C\n|");
	printf("-------------------------------------------\n");
	
startDiscs (nDiscs, towerA);
printDiscs (nDiscs, towerA, towerB, towerC);
}



private static void printDiscs(int nDiscs, Tower towerA2, Tower towerB2, Tower towerC2) {
	// TODO Auto-generated method stub
	
}



private static void printf(String string) {
	// TODO Auto-generated method stub
	
}








private static int readInt(String string) {
	// TODO Auto-generated method stub
	return 0;
}








public  static void moveDiscs (int pN, Tower pTA, Tower pTB, Tower pTC)
{

	if(pN==1)
	{
		pTB.discs++;
		pTB.Tower [pTB.discs-1] = pTA.tower [pTA.discs-1];
		pTA.moveDiscs--;
		printDiscs (pN, pTC, pTC, pTC);
	}
	else
	{
		moveDiscs(pN-1, pTA, pTC, pTB);
		
		
		pTB.tower [pTB.discs-1] = pTA.tower [pTA.moveDiscs-1];
		pTA.moveDiscs--;
		printDiscs (pN, pTC, pTC, pTC);
		
		moveDiscs (pN-1, pTC, pTB, pTA);
	}
}



public static void startDiscs( int pN, Tower pTA)
{
for (int i = 0; i< pN; i++)
	pTA.tower[i] = pN -i;
pTA.discs = pN;
}


public static void printDiscs()
{
int i, max = towerA.discs;
if(towerB.discs > max) max = towerB.discs;
if(towerC.discs > max) max = towerC.discs;

for (i = max; i > 0; i--)
{
	if(towerA.discs >= i) printf ("%10d", towerA.tower[i-1]);
	else printf ("%10c", ' ');
			if (towerB.discs >= i) printf ("%10d", towerB.tower[i-1]);
	else printf ("%10c", ' ');
	if(towerC.discs >= i) printf ("%10d", towerC.tower[i-1]);
	else printf ("%10c", ' ');
	printf("\n");
}

printf ("------------------------------------------------");
readInt (" ");
}








private static void printf(String string, int i) {
	// TODO Auto-generated method stub
	
}


}
