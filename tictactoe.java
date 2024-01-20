import java.awt.*;
import java.awt.event.*;


// TODO:
// Color code who won (right)
// Add tally for number of wins (left)
// Center the game board
// Fix label positions
// Make it so that board doesnt clear immediately after game


class TicTacToeGame extends Frame implements ActionListener {
	
	Button b[] = new Button[9];	
	
	Button b1; // New game
	
	int k=0, x=250, y=28; // Coordinates of board tile positions
	int a=0; // variable to track player (either O or X)
	int z=0, z1=0, z2=0, z3=0, z4=0, z5=0, z6=0, z7=0, z8=0;
	int l=70; //position index for "who won" label
	
	Label resultLabel; // Section that states starting player
	
	TicTacToeGame() {
			
		setLayout(null);
		setVisible(true);
		setSize(800,600);
		setLocation(400,100);
		setBackground(Color.white);
		setForeground(Color.blue);		
		
		for(int i=1;i<=3;i++){
			
			for(int j=1;j<=3;j++){
				
				b[k] = new Button();
				b[k].setSize(100,100);
				b[k].setLocation(x,y);
				b[k].setFont(new Font("",Font.BOLD,40));
				
				add(b[k]);
				
				b[k].addActionListener(this);
				b[k].setBackground(new Color(0,0,0)); // ORANGE
				k++;
				x=x+100;
				
			}
			
			x=250; 
			y=y+100;
		}
		
		// Add "New Game" button that starts new game
		b1 = new Button("New Game");
		b1.setSize(150,40);
		b1.setLocation(325,500);
		b1.setFont(new Font("",Font.BOLD,20));
		b1.setForeground(Color.black);
		
		add(b1);
		b1.addActionListener(this);

		// Add Label that will state starting player
		resultLabel = new Label("");
		resultLabel.setSize(300, 50);
		resultLabel.setLocation(260, 350);
		resultLabel.setFont(new Font("", Font.BOLD, 20));
		resultLabel.setForeground(Color.BLACK);
		resultLabel.setText("New game: Player O Starts");
		add(resultLabel);

	}


	public void actionPerformed(ActionEvent e) {

		// Starts new game
		if(e.getSource() == b1) { // If b1 (new game) button is pressed

			System.out.println("New Game Button was clicked");

			for(int i=0; i<=8; i++) {
				b[i].setEnabled(true);
				b[i].setLabel("");
				
			}
			z=0; z1=0; z2=0; z3=0; z4=0; z5=0; z6=0; z7=0; z8=0;

			// State starting player (O or X)
			if(a%2 == 0) { // O
				resultLabel.setText("New game: Player O Starts");
			}
			else { // X
				resultLabel.setText("New game: Player X Starts");
			}

		}

		// Check which of the 9 buttons has been clicked
		if(e.getSource() == b[0] && z==0) {

			if(a%2 == 0) {
				b[0].setLabel("O"); 
				z++;
				a++;
			}
			else {
				b[0].setLabel("X");
				z++;
				a++;
			}
		}

		if(e.getSource() == b[1] && z1==0) {

			if(a%2 == 0) {
				b[1].setLabel("O"); 
				z1++;
				a++;
			}
			else {
				b[1].setLabel("X");
				z1++;
				a++;
			}
		}

		if(e.getSource() == b[2] && z2==0) {

			if(a%2 == 0) {
				b[2].setLabel("O"); 
				z2++;
				a++;
			}
			else {
				b[2].setLabel("X");
				z2++;
				a++;
			}
		}

		if(e.getSource() == b[3] && z3==0) {

			if(a%2 == 0) {
				b[3].setLabel("O"); 
				z3++;
				a++;
			}
			else {
				b[3].setLabel("X");
				z3++;
				a++;
			}
		}

		if(e.getSource() == b[4] && z4==0) {

			if(a%2 == 0) {
				b[4].setLabel("O"); 
				z4++;
				a++;
			}
			else {
				b[4].setLabel("X");
				z4++;
				a++;
			}
		}

		if(e.getSource() == b[5] && z5==0) {

			if(a%2 == 0) {
				b[5].setLabel("O"); 
				z5++;
				a++;
			}
			else {
				b[5].setLabel("X");
				z5++;
				a++;
			}
		}

		if(e.getSource() == b[6] && z6==0) {

			if(a%2 == 0) {
				b[6].setLabel("O"); 
				z6++;
				a++;
			}
			else {
				b[6].setLabel("X");
				z6++;
				a++;
			}
		}

		if(e.getSource() == b[7] && z7==0) {

			if(a%2 == 0) {
				b[7].setLabel("O"); 
				z7++;
				a++;
			}
			else {
				b[7].setLabel("X");
				z7++;
				a++;
			}
		}

		if(e.getSource() == b[8] && z8==0) {

			if(a%2 == 0) {
				b[8].setLabel("O"); 
				z8++;
				a++;
			}
			else {
				b[8].setLabel("X");
				z8++;
				a++;
			}
		}

		// Check is last move was game winning
		if (gameEnd()) {

			System.out.println("Last move was game ending");
			
			// Make buttons unclickable
			for (int i = 0; i <= 8; i++) {
				b[i].setEnabled(false);
			}
			
		}
	

	}

	
	// Check winning conditions (3 in a row)
	private boolean gameEnd() {

		System.out.println("Checking win conditions");

		Label winLabel = new Label(); // Section that states who which player won
		winLabel.setSize(150, 50);
		winLabel.setFont(new Font("", Font.BOLD, 20));


		// Check if 9 buttons had been clicked
		boolean stillSpaces = false;
		for(int i=0; i<=8; i++) {
			if(b[i].getLabel() == "") {
				stillSpaces = true;
			}
		}

		if(!stillSpaces) { // If the board is full
			winLabel.setText("Draw Game");
			winLabel.setLocation(580, l);
			winLabel.setForeground(Color.YELLOW);
			add(winLabel);
			l += 50;
			return true;
		}


		// 1st row
		if(b[0].getLabel() != "" && b[0].getLabel() == b[1].getLabel() && b[0].getLabel() == b[2].getLabel()) {

			if(b[0].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[0].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		// 2nd row
		else if(b[3].getLabel() != "" && b[3].getLabel() == b[4].getLabel() && b[3].getLabel() == b[5].getLabel()) {

			if(b[3].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[3].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		// 3rd row
		else if(b[6].getLabel() != "" && b[6].getLabel() == b[7].getLabel() && b[6].getLabel() == b[8].getLabel()) {

			if(b[6].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[6].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		//1st column
		else if(b[0].getLabel() != "" && b[0].getLabel() == b[3].getLabel() && b[0].getLabel() == b[6].getLabel()) {

			if(b[0].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[0].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		// 2nd column
		else if(b[1].getLabel() != "" && b[1].getLabel() == b[4].getLabel() && b[1].getLabel() == b[7].getLabel()) {

			if(b[1].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[1].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		// 3rd column
		else if(b[2].getLabel() != "" && b[2].getLabel() == b[5].getLabel() && b[2].getLabel() == b[8].getLabel()) {

			if(b[2].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[2].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		//diagonal \
		else if(b[0].getLabel() != "" && b[0].getLabel() == b[4].getLabel() && b[0].getLabel() == b[8].getLabel()) {

			if(b[0].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[0].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		// diagonal /
		else if(b[6].getLabel() != "" && b[6].getLabel() == b[4].getLabel() && b[6].getLabel() == b[2].getLabel()) {

			if(b[6].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			if(b[6].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			return true;
		}

		else {
			return false;
		}

	}
	
	
}


public class tictactoe{

	public static void main (String ar[]){
	
		TicTacToeGame t = new TicTacToeGame();
	}
}