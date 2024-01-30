import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// TODO:
// Highlight winning 3 in a row with yellow



class TicTacToeGame extends Frame implements ActionListener {
	
	Button b[] = new Button[9];	
	
	Button b1; // New game
	
	int k=0, x=250, y=28; // Coordinates of board tile positions
	int a=0; // variable to track player (either O or X)
	int z=0, z1=0, z2=0, z3=0, z4=0, z5=0, z6=0, z7=0, z8=0;
	int l=70; //position index for "who won" label
	int player1NumWins=0; // player1 win count
	int player2NumWins=0; // player2 win count
	
	Label resultLabel; // Section that states starting player
	Label winHeader; // Label that states "Wins"

	JLabel player1WinsLabel; // Label to display player 1 wins
    JLabel player2WinsLabel; // Label to display player 2 wins

	boolean drawGame=false;

	
	TicTacToeGame() {
			
		setLayout(null);
		setVisible(true);
		setSize(800,600);
		setLocation(400,100);
		setBackground(Color.white);
		setForeground(Color.black);		
		
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

		// Add label that states "Wins"
		winHeader = new Label("Wins:");
		winHeader.setSize(120, 50);
		winHeader.setLocation(65, 55);
		winHeader.setFont(new Font("", Font.BOLD, 40));
		winHeader.setForeground(Color.BLACK);
		add(winHeader);

		// Labels that state each player win count
		player1WinsLabel = new JLabel("Player 1: " + player1NumWins);
        player1WinsLabel.setSize(200, 50);
        player1WinsLabel.setLocation(45, 110);
        player1WinsLabel.setFont(new Font("", Font.BOLD, 30));
        player1WinsLabel.setForeground(Color.BLUE);
        add(player1WinsLabel);

        player2WinsLabel = new JLabel("Player 2: " + player2NumWins);
        player2WinsLabel.setSize(200, 50);
        player2WinsLabel.setLocation(45, 160);
        player2WinsLabel.setFont(new Font("", Font.BOLD, 30));
        player2WinsLabel.setForeground(Color.RED);
        add(player2WinsLabel);
		
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
				resultLabel.setText("New game: Player 1 (O) Starts");
			}
			else { // X
				resultLabel.setText("New game: Player 2 (X) Starts");
			}

		}

		// Check which of the 9 buttons has been clicked
		if(e.getSource() == b[0] && z==0) {

			if(a%2 == 0) {
				b[0].setLabel("O"); 
				b[0].setForeground(Color.blue);	
				z++;
				a++;
			}
			else {
				b[0].setLabel("X");
				b[0].setForeground(Color.red);	
				z++;
				a++;
			}
		}

		if(e.getSource() == b[1] && z1==0) {

			if(a%2 == 0) {
				b[1].setLabel("O"); 
				b[1].setForeground(Color.blue);	
				z1++;
				a++;
			}
			else {
				b[1].setLabel("X");
				b[1].setForeground(Color.red);
				z1++;
				a++;
			}
		}

		if(e.getSource() == b[2] && z2==0) {

			if(a%2 == 0) {
				b[2].setLabel("O"); 
				b[2].setForeground(Color.blue);	
				z2++;
				a++;
			}
			else {
				b[2].setLabel("X");
				b[2].setForeground(Color.red);	
				z2++;
				a++;
			}
		}

		if(e.getSource() == b[3] && z3==0) {

			if(a%2 == 0) {
				b[3].setLabel("O"); 
				b[3].setForeground(Color.blue);	
				z3++;
				a++;
			}
			else {
				b[3].setLabel("X");
				b[3].setForeground(Color.red);	
				z3++;
				a++;
			}
		}

		if(e.getSource() == b[4] && z4==0) {

			if(a%2 == 0) {
				b[4].setLabel("O"); 
				b[4].setForeground(Color.blue);	
				z4++;
				a++;
			}
			else {
				b[4].setLabel("X");
				b[4].setForeground(Color.red);	
				z4++;
				a++;
			}
		}

		if(e.getSource() == b[5] && z5==0) {

			if(a%2 == 0) {
				b[5].setLabel("O"); 
				b[5].setForeground(Color.blue);	
				z5++;
				a++;
			}
			else {
				b[5].setLabel("X");
				b[5].setForeground(Color.red);	
				z5++;
				a++;
			}
		}

		if(e.getSource() == b[6] && z6==0) {

			if(a%2 == 0) {
				b[6].setLabel("O"); 
				b[6].setForeground(Color.blue);	
				z6++;
				a++;
			}
			else {
				b[6].setLabel("X");
				b[6].setForeground(Color.red);	
				z6++;
				a++;
			}
		}

		if(e.getSource() == b[7] && z7==0) {

			if(a%2 == 0) {
				b[7].setLabel("O"); 
				b[7].setForeground(Color.blue);	
				z7++;
				a++;
			}
			else {
				b[7].setLabel("X");
				b[7].setForeground(Color.red);	
				z7++;
				a++;
			}
		}

		if(e.getSource() == b[8] && z8==0) {

			if(a%2 == 0) {
				b[8].setLabel("O"); 
				b[8].setForeground(Color.blue);	
				z8++;
				a++;
			}
			else {
				b[8].setLabel("X");
				b[8].setForeground(Color.red);	
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

			// Update win counter as long as not a draw game
			if(!drawGame) {
				if(a%2 == 0) {
					player2NumWins++;
					player2WinsLabel.setText("Player 2: " + player2NumWins);
				}
				else {
					player1NumWins++;
					player1WinsLabel.setText("Player 1: " + player1NumWins);
				}

				drawGame = false;
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
			winLabel.setForeground(new Color(139, 128, 0)); // dark yellow
			add(winLabel);
			l += 50;
			drawGame = true;
			return true;
		}


		// 1st row
		if(b[0].getLabel() != "" && b[0].getLabel() == b[1].getLabel() && b[0].getLabel() == b[2].getLabel()) {

			if(b[0].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			if(b[0].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
				add(winLabel);
				l += 50;
			}

			//set variable here to remember which buttons to change color of 
			
			
			return true;
		}

		// 2nd row
		else if(b[3].getLabel() != "" && b[3].getLabel() == b[4].getLabel() && b[3].getLabel() == b[5].getLabel()) {

			if(b[3].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			if(b[3].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
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
				winLabel.setForeground(Color.BLUE);
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

		//1st column
		else if(b[0].getLabel() != "" && b[0].getLabel() == b[3].getLabel() && b[0].getLabel() == b[6].getLabel()) {

			if(b[0].getLabel() == "O") {
				winLabel.setText("Player 1 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			if(b[0].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
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
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			if(b[1].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
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
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			if(b[2].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
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
				winLabel.setForeground(Color.BLUE);
				add(winLabel);
				l += 50;
			}

			if(b[0].getLabel() == "X") {
				winLabel.setText("Player 2 Wins!");
				winLabel.setLocation(580, l);
				winLabel.setForeground(Color.RED);
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
				winLabel.setForeground(Color.BLUE);
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