import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frame;
	private JTextField xcount;
	private JTextField ocount;
	private int xcount1=0;
	private int ocount1=0;
	private String startGame="X";
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int i=0;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}
	private void winningGame()
	{
		//for player X
		if(b1==1 && b2==1 && b3==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b1==1 && b4==1 && b7==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b1==1 && b5==1 && b9==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b4==1 && b5==1 && b6==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b7==1 && b8==1 && b9==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b2==1 && b5==1 && b8==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b3==1 && b6==1 && b9==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		else if(b3==1 && b5==1 && b7==1)
		{
			JOptionPane.showMessageDialog(frame,"Player X Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
		}
		//for player O
		else if(b1==0 && b2==0 && b3==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b1==0 && b4==0 && b7==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b1==0 && b5==0 && b9==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b4==0 && b5==0 && b6==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b7==0 && b8==0 && b9==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b2==0 && b5==0 && b8==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b3==0 && b6==0 && b9==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(b3==0 && b5==0 && b7==0)
		{
			JOptionPane.showMessageDialog(frame,"Player O Wins","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			ocount.setText(String.valueOf(ocount1));
		}
		else if(i==9)
		{
			JOptionPane.showMessageDialog(frame,"Draw","Tic Tak Toe",JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	private void choosePlayer()
	{
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="0";
		}
		else
		{
			startGame="X";
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton bt1 = new JButton("");
		bt1.setBackground(new Color(240, 240, 240));
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt1.setForeground(Color.RED);
					b1=1;
					i++;
				}
				else
				{
					bt1.setForeground(Color.BLUE);
					b1=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt1.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_1.add(bt1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt2.setForeground(Color.RED);
					b2=1;
					i++;
				}
				else
				{
					bt2.setForeground(Color.BLUE);
					b2=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
			
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_2.add(bt2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton bt3 = new JButton("");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt3.setForeground(Color.RED);
					b3=1;
					i++;
				}
				else
				{
					bt3.setForeground(Color.BLUE);
					b3=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_3.add(bt3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		xcount = new JTextField();
		xcount.setBackground(Color.YELLOW);
		xcount.setHorizontalAlignment(SwingConstants.CENTER);
		xcount.setText("0");
		xcount.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_5.add(xcount, BorderLayout.CENTER);
		xcount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton bt4 = new JButton("");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt4.setForeground(Color.RED);
					b4=1;
					i++;
				}
				else
				{
					bt4.setForeground(Color.BLUE);
					b4=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt4.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_6.add(bt4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton bt5 = new JButton("");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt5.setForeground(Color.RED);
					b5=1;
					i++;
				}
				else
				{
					bt5.setForeground(Color.BLUE);
					b5=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt5.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_7.add(bt5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton bt6 = new JButton("");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt6.setForeground(Color.RED);
					b6=1;
					i++;
				}
				else
				{
					bt6.setForeground(Color.BLUE);
					b6=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_8.add(bt6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		ocount = new JTextField();
		ocount.setBackground(Color.GREEN);
		ocount.setFont(new Font("Tahoma", Font.BOLD, 60));
		ocount.setText("0");
		ocount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(ocount, BorderLayout.CENTER);
		ocount.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton bt7 = new JButton("");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt7.setForeground(Color.RED);
					b7=1;
					i++;
				}
				else
				{
					bt7.setForeground(Color.BLUE);
					b7=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt7.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_11.add(bt7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton bt8 = new JButton("");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt8.setForeground(Color.RED);
					b8=1;
					i++;
				}
				else
				{
					bt8.setForeground(Color.BLUE);
					b8=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt8.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_12.add(bt8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton bt9 = new JButton("");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					bt9.setForeground(Color.RED);
					b9=1;
					i++;
				}
				else
				{
					bt9.setForeground(Color.BLUE);
					b9=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		bt9.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_13.add(bt9, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btreset = new JButton("RESET");
		btreset.setBackground(Color.ORANGE);
		btreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt1.setText(null);
				bt2.setText(null);
				bt3.setText(null);
				bt4.setText(null);
				bt5.setText(null);
				bt6.setText(null);
				bt7.setText(null);
				bt8.setText(null);
				bt9.setText(null);
				b1=10;
				b2=10;
				b3=10;
				b4=10;
				b5=10;
				b6=10;
				b7=10;
				b8=10;
				b9=10;
				i=10;
				
			}
		});
		btreset.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_15.add(btreset, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btexit = new JButton("EXIT");
		btexit.setBackground(Color.CYAN);
		btexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm to Exit","TicTacToe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btexit.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_14.add(btexit, BorderLayout.CENTER);
	}

	public int getXcount1() {
		return xcount1;
	}

	public void setXcount1(int xcount1) {
		this.xcount1 = xcount1;
	}

	public int getOcount1() {
		return ocount1;
	}

	public void setOcount1(int ocount1) {
		this.ocount1 = ocount1;
	}

	public String getStartGame() {
		return startGame;
	}

	public void setStartGame(String startGame) {
		this.startGame = startGame;
	}

	public int getB1() {
		return b1;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public int getB2() {
		return b2;
	}

	public void setB2(int b2) {
		this.b2 = b2;
	}

	public int getB3() {
		return b3;
	}

	public void setB3(int b3) {
		this.b3 = b3;
	}

	public int getB4() {
		return b4;
	}

	public void setB4(int b4) {
		this.b4 = b4;
	}

	public int getB5() {
		return b5;
	}

	public void setB5(int b5) {
		this.b5 = b5;
	}

	public int getB6() {
		return b6;
	}

	public void setB6(int b6) {
		this.b6 = b6;
	}

	public int getB7() {
		return b7;
	}

	public void setB7(int b7) {
		this.b7 = b7;
	}

	public int getB8() {
		return b8;
	}

	public void setB8(int b8) {
		this.b8 = b8;
	}

	public int getB9() {
		return b9;
	}

	public void setB9(int b9) {
		this.b9 = b9;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
