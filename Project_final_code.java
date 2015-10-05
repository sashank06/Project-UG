package elections;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.SearchAlgorithm;
import weka.classifiers.bayes.net.search.local.K2;
import weka.classifiers.bayes.net.search.local.TAN;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.arffviewer.ArffPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.core.converters.ArffSaver;

public class Elections extends javax.swing.JFrame
{

	String path;
	Instances data;
	Instances data1;
	Instances d1;
	K2 classifier1;
	TAN classifier2;
	String count, s;
	BayesNet nB;
	int ch[] = new int[30];
	int i = 0;
	Evaluation e1;

	public Elections()
	{
		initComponents();
	}

	private void initComponents()
	{

		jFrame1 = new javax.swing.JFrame();
		jFrame5 = new javax.swing.JFrame();
		jLabel3 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButtonnk = new javax.swing.JButton();
		jButtonnt = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabeln = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		tt1 = new javax.swing.JTextArea();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButtonc = new javax.swing.JButton();
		jFrame2 = new javax.swing.JFrame();
		jFrame6 = new javax.swing.JFrame();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		c1 = new java.awt.Checkbox();
		c2 = new java.awt.Checkbox();
		c3 = new java.awt.Checkbox();
		c4 = new java.awt.Checkbox();
		c5 = new java.awt.Checkbox();
		c6 = new java.awt.Checkbox();
		c7 = new java.awt.Checkbox();
		c8 = new java.awt.Checkbox();
		c9 = new java.awt.Checkbox();
		c10 = new java.awt.Checkbox();
		c11 = new java.awt.Checkbox();
		c12 = new java.awt.Checkbox();
		c13 = new java.awt.Checkbox();
		c14 = new java.awt.Checkbox();
		c15 = new java.awt.Checkbox();
		c16 = new java.awt.Checkbox();
		c17 = new java.awt.Checkbox();
		c18 = new java.awt.Checkbox();
		jFrame3 = new javax.swing.JFrame();
		jLabel7 = new javax.swing.JLabel();
		jButton10 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jScrollPane4 = new javax.swing.JScrollPane();
		jScrollPane5 = new javax.swing.JScrollPane();
		tt2 = new javax.swing.JTextArea();
		tt3 = new javax.swing.JTextArea();
		tt4 = new javax.swing.JTextArea();
		jButtonck = new javax.swing.JButton();
		jButtonct = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabelc = new javax.swing.JLabel();
		jFrame4 = new javax.swing.JFrame();
		jLabel9 = new javax.swing.JLabel();
		jButton13 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButtonbk = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		T1 = new javax.swing.JTextField("E:/Weka-3-7/data/vote.arff");

		jFrame1.setMinimumSize(new java.awt.Dimension(600, 500));
		jFrame1.setName("Analysis of General Elections");

		jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabel3.setText("Urban Results");

		jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11));
		jButton2.setText("K2");
		jButton2.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButton2ActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabel4.setText("");

		tt1.setColumns(20);
		tt1.setRows(5);
		jScrollPane3.setViewportView(tt1);

		tt3.setColumns(20);
		tt3.setRows(5);
		jScrollPane4.setViewportView(tt3);


		jButton3.setLabel("back");
		jButton3.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("Times New Roman", 1, 11));
		jButton4.setText("TAN");
		jButton4.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButton4ActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		jButtonc.setFont(new java.awt.Font("Times New Roman", 1, 11));
		jButtonc.setText("Customise");
		jButtonc.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButtoncActionPerformed(evt);
			}
		});


		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(
			jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
				.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame1Layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
								.addComponent(jLabel3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jFrame1Layout.createSequentialGroup()
								.addComponent(jButton2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton4)
								.addGap(52, 52, 52)))
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(jFrame1Layout.createSequentialGroup()
								.addGap(49, 49, 49))
						)
						.addGap(37, 37, 37))
					.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel4))
						.addGap(56, 56, 56)))
				.addComponent(jButton3)
				.addContainerGap())
		);
		jFrame1Layout.setVerticalGroup(
			jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
				)
				.addGap(38, 38, 38)
				.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButton2)
					.addComponent(jButton4))
				.addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame1Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
					.addGroup(jFrame1Layout.createSequentialGroup()
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3)))
				.addContainerGap())
		);


		jFrame2.setMinimumSize(new java.awt.Dimension(600, 500));
		jFrame2.setName("Elections attributes selection");
		jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton6.setText("Classify");
		jButton6.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton7.setText("VIEW DATA");
		jButton7.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButton7ActionPerformed(evt);
				}
				catch (IOException ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabel6.setText("Select the Attributes to be removed");

		jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton8.setText("REMOVE");
		jButton8.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton8ActionPerformed(evt);
			}
		});

		c1.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c1.setLabel("water scheme");
		c1.setName("1");
		c1.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c1ItemStateChanged(evt);
			}
		});

		c2.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c2.setLabel("uninterrupted power supply");
		c2.setName("2");
		c2.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c2ItemStateChanged(evt);
			}
		});

		c3.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c3.setLabel("tax benefits");
		c3.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c3ItemStateChanged(evt);
			}
		});

		c4.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c4.setLabel("fuel price control");
		c4.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c4ItemStateChanged(evt);
			}
		});

		c5.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c5.setLabel("subsidised LPG");
		c5.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c5ItemStateChanged(evt);
			}
		});

		c6.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c6.setLabel("infrastructure development");
		c6.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c6ItemStateChanged(evt);
			}
		});

		c7.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c7.setLabel("agricultural subsidies");
		c7.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c7ItemStateChanged(evt);
			}
		});

		c8.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c8.setLabel("FDI");
		c8.setName("8");
		c8.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c8ItemStateChanged(evt);
			}
		});

		c9.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c9.setLabel("Inflation control");
		c9.setName("9");
		c9.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c9ItemStateChanged(evt);
			}
		});

		c10.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c10.setLabel("Better Foreign Policy");
		c10.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c10ItemStateChanged(evt);
			}
		});

		c11.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c11.setLabel("Increased Military budget");
		c11.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c11ItemStateChanged(evt);
			}
		});

		c12.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c12.setLabel("100% literacy rate");
		c12.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c12ItemStateChanged(evt);
			}
		});

		c13.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c13.setLabel("Guaranteed Job for a Family");
		c13.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c13ItemStateChanged(evt);
			}
		});

		c14.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c14.setLabel("HealthCare");
		c14.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c14ItemStateChanged(evt);
			}
		});

		c15.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c15.setLabel("LowerRateofinterestforeducationloans");
		c15.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c15ItemStateChanged(evt);
			}
		});

		c16.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c16.setLabel("reduced Import duties");
		c16.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c16ItemStateChanged(evt);
			}
		});

		c17.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c17.setLabel("consumer empowerment");
		c17.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c17ItemStateChanged(evt);
			}
		});

		c18.setFont(new java.awt.Font("Times New Roman", 1, 12));
		c18.setLabel("party");
		c18.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				c18ItemStateChanged(evt);
			}
		});

		javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
		jFrame2.getContentPane().setLayout(jFrame2Layout);
		jFrame2Layout.setHorizontalGroup(
			jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame2Layout.createSequentialGroup()
				.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addGap(90, 90, 90)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(98, 98, 98)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jFrame2Layout.createSequentialGroup()
									.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
									.addGap(91, 91, 91)
									.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addGap(106, 106, 106)
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(269, javax.swing.GroupLayout.PREFERRED_SIZE))
		);
		jFrame2Layout.setVerticalGroup(
			jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame2Layout.createSequentialGroup()
				.addGap(33, 33, 33)
				.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(22, 22, 22)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addGap(9, 9, 9)
						.addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
						.addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(21, 21, 21)
				.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame2Layout.createSequentialGroup()
								.addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(17, 17, 17)
								.addComponent(c17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame2Layout.createSequentialGroup()
								.addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(17, 17, 17)
								.addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(28, 28, 28)
						.addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(109, Short.MAX_VALUE))
					.addGroup(jFrame2Layout.createSequentialGroup()
						.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(78, 78, 78)
						.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())))
		);

		jFrame3.setMinimumSize(new java.awt.Dimension(600, 500));
		jFrame3.setResizable(false);

		jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabel7.setText("Rural Results ");

		jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jButton10.setText("TAN");
		jButton10.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButton10ActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		tt2.setColumns(20);
		tt2.setRows(5);
		jScrollPane2.setViewportView(tt2);
		jButton12.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jButton12.setText("K2");
		jButton12.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButton12ActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		jButton14.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton14.setText("Back");
		jButton14.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton14ActionPerformed(evt);
			}
		});
		jButtonnk.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButtonnk.setText("K2");
		jButtonnk.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButtonnkActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		jButtonnt.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButtonnt.setText("TAN");
		jButtonnt.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButtonntActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		jButtonbk.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButtonbk.setText("back");
		jButtonbk.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButtonbkActionPerformed(evt);
			}

			private void jButtonbkActionPerformed(ActionEvent evt)
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});

		jLabeln.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabeln.setText("Nationwide Results ");
		jButtonck.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButtonck.setText("K2");
		jButtonck.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButtonckActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		jButtonct.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButtonct.setText("TAN");
		jButtonct.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				try
				{
					jButtonctActionPerformed(evt);
				}
				catch (Exception ex)
				{
					Logger.getLogger(Elections.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		jLabelc.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabelc.setText("Customise Results ");
		tt4.setColumns(20);
		tt4.setRows(5);
		jScrollPane5.setViewportView(tt4);
		javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
		jFrame5.getContentPane().setLayout(jFrame5Layout);
		jFrame5Layout.setHorizontalGroup(
			jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame5Layout.createSequentialGroup()
				.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame5Layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame5Layout.createSequentialGroup()
								.addComponent(jLabeln)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jFrame5Layout.createSequentialGroup()
								.addComponent(jButtonnk)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonnt)
								.addGap(52, 52, 52)))
						.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(jFrame5Layout.createSequentialGroup()
								.addGap(49, 49, 49))
						)
						.addGap(37, 37, 37))
					.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame5Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel4))
						.addGap(56, 56, 56)))
				.addComponent(jButton3)
				.addContainerGap())
		);
		jFrame5Layout.setVerticalGroup(
			jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame5Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jLabeln, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
				)
				.addGap(38, 38, 38)
				.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButtonnk)
					.addComponent(jButtonnt))
				.addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame5Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
					.addGroup(jFrame5Layout.createSequentialGroup()
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3)))
				.addContainerGap())
		);


		javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
		jFrame6.getContentPane().setLayout(jFrame6Layout);
		jFrame6Layout.setHorizontalGroup(
			jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame6Layout.createSequentialGroup()
				.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame6Layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame6Layout.createSequentialGroup()
								.addComponent(jLabelc)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(jFrame6Layout.createSequentialGroup()
								.addComponent(jButtonck)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonct)
								.addGap(52, 52, 52)))
						.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(jFrame6Layout.createSequentialGroup()
								.addGap(49, 49, 49))
						)
						.addGap(37, 37, 37))
					.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame6Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel4))
						.addGap(56, 56, 56)))
				.addComponent(jButton3)
				.addContainerGap())
		);
		jFrame6Layout.setVerticalGroup(
			jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame6Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jLabelc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
				)
				.addGap(38, 38, 38)
				.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButtonck)
					.addComponent(jButtonct))
				.addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame6Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
					.addGroup(jFrame6Layout.createSequentialGroup()
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3)))
				.addContainerGap())
		);



		javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
		jFrame3.getContentPane().setLayout(jFrame3Layout);
		jFrame3Layout.setHorizontalGroup(
			jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame3Layout.createSequentialGroup()
				.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jFrame3Layout.createSequentialGroup()
						.addGap(38, 38, 38)
						.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addGroup(jFrame3Layout.createSequentialGroup()
								.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addGroup(jFrame3Layout.createSequentialGroup()
										.addComponent(jButton12)
										.addGap(75, 75, 75)
										.addComponent(jButton10))
									.addComponent(jLabel7))
								.addGap(68, 68, 68)
								.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)))
							.addGroup(jFrame3Layout.createSequentialGroup()
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27)
								.addComponent(jButton14))))
					.addGroup(jFrame3Layout.createSequentialGroup()
						.addGap(85, 85, 85)
						.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(40, Short.MAX_VALUE))
		);
		jFrame3Layout.setVerticalGroup(
			jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame3Layout.createSequentialGroup()
				.addGap(54, 54, 54)
				.addComponent(jLabel8)
				.addGap(18, 18, 18)
				.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(47, 47, 47)
				.addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButton12)
					.addComponent(jButton10))
				.addGap(18, 18, 18)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
			)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
				.addContainerGap(335, Short.MAX_VALUE)
				.addComponent(jButton14)
				.addContainerGap())
		);

		jFrame4.setMinimumSize(new java.awt.Dimension(600, 500));

		jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jLabel9.setText("Choose your options");
		jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton13.setText("Urban Areas");
		jButton13.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton13ActionPerformed(evt);
			}
		});

		jButton15.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton15.setText("Rural Areas");
		jButton15.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton16.setText("Nationwide");
		jButton16.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setFont(new java.awt.Font("Times New Roman", 1, 11));
		jButton17.setText("BACK");
		jButton17.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton17ActionPerformed(evt);
			}

			private void jButton17ActionPerformed(ActionEvent evt)
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});


		javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
		jFrame4.getContentPane().setLayout(jFrame4Layout);
		jFrame4Layout.setHorizontalGroup(
			jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame4Layout.createSequentialGroup()
				.addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jFrame4Layout.createSequentialGroup()
						.addGap(49, 49, 49)
						.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50)
					).addGroup(jFrame4Layout.createSequentialGroup()
						.addGap(237, 237, 237)
						.addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jButtonc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
						.addComponent(jButton17)))
				.addContainerGap())
		);
		jFrame4Layout.setVerticalGroup(
			jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jFrame4Layout.createSequentialGroup()
				.addGap(91, 91, 91)
				.addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
				)
				.addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(jFrame4Layout.createSequentialGroup()
						.addGap(76, 76, 76)
						.addComponent(jButtonc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(42, 42, 42)
						.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE))
					.addGroup(jFrame4Layout.createSequentialGroup()
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton17)
						.addContainerGap())))
		);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(545, 454));

		jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36));
		jLabel1.setText("Analysis of General Elections");

		jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
		jLabel2.setText("ENTER THE FILE PATH");

		jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
		jButton5.setFont(new java.awt.Font("Tahoma", 1, 11));
		jButton5.setText("Preferences");
		jButton5.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton5ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel5.setText("");

		jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
		jButton1.setText("VIEW DATA");
		jButton1.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton1ActionPerformed(evt);
			}
		});

		T1.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				T1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(20, 20, 20))
			.addGroup(layout.createSequentialGroup()
				.addGap(254, 254, 254)
				.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(layout.createSequentialGroup()
						.addGap(87, 87, 87)
						.addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(layout.createSequentialGroup()
						.addGap(141, 141, 141)
						.addComponent(jButton1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton5)))
				.addGap(117, 117, 117))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(37, 37, 37)
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(50, 50, 50)
				.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(57, 57, 57)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(56, 56, 56)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jButton5)
					.addComponent(jButton1))
				.addContainerGap())
		);

		pack();
	}
	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame5.setVisible(true);
		jFrame4.setVisible(false);
	}
	private void jButtoncActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame2.setVisible(true);
		jFrame4.setVisible(false);
	}
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/Weka-3-7/data/vote.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier2 = new TAN();
		nB.setSearchAlgorithm(classifier2);
		classifier2.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt2.setText(eVal.toSummaryString("\nResults======\n", true));
		tt2.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));

	}
	private void jButtonnkActionPerformed(java.awt.event.ActionEvent evt) throws Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/Weka-3-7/data/vote.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier1 = new K2();
		nB.setSearchAlgorithm(classifier1);
		classifier1.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt3.setText(eVal.toSummaryString("\nResults======\n", true));
		tt3.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));

	}
	private void jButtonckActionPerformed(java.awt.event.ActionEvent evt) throws Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/s.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier1 = new K2();
		nB.setSearchAlgorithm(classifier1);
		classifier1.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt4.setText(eVal.toSummaryString("\nResults======\n", true));
		tt4.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));

	}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
	{

		path = T1.getText();

		try
		{
			ArffLoader loader = new ArffLoader();
			loader.setSource(new File(path));
			Instances d11 = loader.getDataSet();
			ArffPanel data11 = new ArffPanel(d11);
			JFrame f11 = new JFrame("" + data11);
			f11.setSize(545, 500);
			f11.getContentPane().setLayout(new BorderLayout());
			f11.getContentPane().add(data11, BorderLayout.CENTER);
			f11.setVisible(true);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(
				this,
				"please! enter the correct path",
				"Error",
				JOptionPane.ERROR_MESSAGE
			);
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException, FileNotFoundException
	{

		try
		{
			ArffPanel data12 = new ArffPanel(data);
			JFrame f11 = new JFrame("" + d1);
			f11.setSize(545, 500);
			f11.getContentPane().setLayout(new BorderLayout());
			f11.getContentPane().add(data12, BorderLayout.CENTER);
			f11.setVisible(true);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(
				this,
				"please! enter the correct path",
				"Error",
				JOptionPane.ERROR_MESSAGE
			);
		}
	}
	private void T1ActionPerformed(java.awt.event.ActionEvent evt)
	{
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/Weka-3-7/data/vote.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier1 = new K2();
		nB.setSearchAlgorithm(classifier1);
		classifier1.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt1.setText(eVal.toSummaryString("\nResults======\n", true));
		tt1.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));

	}
	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame3.setVisible(true);
		jFrame4.setVisible(false);
	}
	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame1.setVisible(true);
		jFrame4.setVisible(false);
	}
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame1.setVisible(false);
		jFrame4.setVisible(true);
	}
	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)
	{
		path = T1.getText();
		try
		{
			ArffLoader loader = new ArffLoader();
			loader.setSource(new File(path));
			data = loader.getDataSet();
			jFrame4.setVisible(true);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(
				this,
				"please! enter the correct path",
				"Error",
				JOptionPane.ERROR_MESSAGE
			);
		}
	}
	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame6.setVisible(true);
		jFrame2.setVisible(false);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
	{
		int max = i;
		int index[] = new int[max];
		System.arraycopy(ch, 0, index, 0, max);
		String temp = Arrays.toString(index);
		String removedata = temp.substring(1, temp.length() - 1);
		try
		{
			String[] options = new String[2];
			options[0] = "-R";
			for (i = 0; i < max; i++)
			{
				options[1] = removedata;
				Remove r = new Remove();
				r.setOptions(options);
				r.setInputFormat(data);
				data = Filter.useFilter(data, r);
				ArffSaver sa = new ArffSaver();
				sa.setInstances(data);
				sa.setFile(new File("E:/s.arff"));
				sa.writeBatch();
			}
			JOptionPane.showMessageDialog(
				this,
				"The specified data are removed",
				"",
				JOptionPane.INFORMATION_MESSAGE);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(
				this,
				e,
				"Error",
				JOptionPane.ERROR_MESSAGE
			);
		}
	}
	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException, Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/Weka-3-7/data/vote.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier1 = new K2();
		nB.setSearchAlgorithm(classifier1);
		classifier1.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt2.setText(eVal.toSummaryString("\nResults======\n", true));
		tt2.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));
	}
	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException, Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/Weka-3-7/data/vote.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier2 = new TAN();
		nB.setSearchAlgorithm(classifier2);
		classifier2.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt2.setText(eVal.toSummaryString("\nResults======\n", true));
		tt2.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));
	}
	private void jButtonntActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/Weka-3-7/data/vote.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier2 = new TAN();
		nB.setSearchAlgorithm(classifier2);
		classifier2.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt3.setText(eVal.toSummaryString("\nResults======\n", true));
		tt3.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));
	}
	private void jButtonctActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, Exception
	{
		BufferedReader breader = null;
		breader = new BufferedReader(new FileReader("E:/s.arff"));
		Instances train = new Instances(breader);
		train.setClassIndex(train.numAttributes() - 1);
		breader.close();
		nB = new BayesNet();
		nB.buildClassifier(train);
		classifier2 = new TAN();
		nB.setSearchAlgorithm(classifier2);
		classifier2.buildStructure(nB, train);
		Evaluation eVal = new Evaluation(train);
		eVal.confusionMatrix();
		eVal.crossValidateModel(nB, train, 10, new Random(1));
		tt4.setText(eVal.toSummaryString("\nResults======\n", true));
		tt4.setText(eVal.fMeasure(1) + " " + eVal.precision(1) + " " + eVal.recall(1));
	}
	private void c1ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c1.getState() == true)
		{
			ch[i] = 1;
			i++;
		}
	}

	private void c2ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c2.getState() == true)
		{
			ch[i] = 2;
			i++;
		}
	}

	private void c3ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c3.getState() == true)
		{
			ch[i] = 3;
			i++;
		}
	}

	private void c4ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c4.getState() == true)
		{
			ch[i] = 4;
			i++;
		}
	}

	private void c5ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c5.getState() == true)
		{
			ch[i] = 5;
			i++;
		}
	}

	private void c6ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c6.getState() == true)
		{
			ch[i] = 6;
			i++;

		}
	}

	private void c7ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c7.getState() == true)
		{
			ch[i] = 7;
			i++;
		}
	}

	private void c8ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c8.getState() == true)
		{
			ch[i] = 8;
			i++;
		}
	}

	private void c9ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c9.getState() == true)
		{
			ch[i] = 9;
			i++;
		}
	}

	private void c10ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c10.getState() == true)
		{
			ch[i] = 10;
			i++;
		}
	}

	private void c11ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c11.getState() == true)
		{
			ch[i] = 11;
			i++;
		}
	}

	private void c12ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c12.getState() == true)
		{
			ch[i] = 12;
			i++;
		}
	}

	private void c13ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c13.getState() == true)
		{
			ch[i] = 13;
			i++;
		}
	}

	private void c14ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c14.getState() == true)
		{
			ch[i] = 14;
			i++;
		}
	}

	private void c15ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c15.getState() == true)
		{
			ch[i] = 15;
			i++;
		}
	}

	private void c16ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c16.getState() == true)
		{
			ch[i] = 16;
			i++;
		}
	}

	private void c17ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c17.getState() == true)
		{
			ch[i] = 17;
			i++;
		}
	}

	private void c18ItemStateChanged(java.awt.event.ItemEvent evt)
	{
		if (c18.getState() == true)
		{
			ch[i] = 18;
			i++;
		}
	}
	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt)
	{
		jFrame3.setVisible(false);
		jFrame4.setVisible(true);
	}

	public static void main(String args[])
	{
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new Elections().setVisible(true);
			}
		});
	}
	private javax.swing.JTextField T1;
	private java.awt.Checkbox c1;
	private java.awt.Checkbox c10;
	private java.awt.Checkbox c11;
	private java.awt.Checkbox c12;
	private java.awt.Checkbox c13;
	private java.awt.Checkbox c14;
	private java.awt.Checkbox c15;
	private java.awt.Checkbox c16;
	private java.awt.Checkbox c17;
	private java.awt.Checkbox c18;
	private java.awt.Checkbox c2;
	private java.awt.Checkbox c3;
	private java.awt.Checkbox c4;
	private java.awt.Checkbox c5;
	private java.awt.Checkbox c6;
	private java.awt.Checkbox c7;
	private java.awt.Checkbox c8;
	private java.awt.Checkbox c9;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButtonnk;
	private javax.swing.JButton jButtonc;
	private javax.swing.JButton jButtonnt;
	private javax.swing.JButton jButtonbk;
	private javax.swing.JButton jButtonct;
	private javax.swing.JButton jButtonck;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JFrame jFrame2;
	private javax.swing.JFrame jFrame3;
	private javax.swing.JFrame jFrame4;
	private javax.swing.JFrame jFrame5;
	private javax.swing.JFrame jFrame6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabeln;
	private javax.swing.JLabel jLabelc;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTextArea tt1;
	private javax.swing.JTextArea tt2;
	private javax.swing.JTextArea tt3;
	private javax.swing.JTextArea tt4;
}