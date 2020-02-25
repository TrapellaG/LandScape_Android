package com.example.landscape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity
{
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;

    private TextView Winner;

    private int game[][] = new int[3][3];

    private Boolean turn;

    private int counts = 0;

    private void CheckWinner()
    {
        int player1 = 0;
        int player2 = 0;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(game[i][j] == 1)
                {
                    if (j + 1 <= 2 && game[i][j + 1] == 1) //horizontal
                    {
                        player1++;

                        if (j + 2 <= 2 && game[i][j + 2] == 1)
                        {
                            player1++;
                        } else {
                            player1 = 0;
                        }
                    } else
                        {
                            player1 = 0;
                    }

                    if(player1 == 2)
                    {
                        Winner.setText("player 1 wins!");
                        return;
                    }

                    if (j - 1 >= 0 && game[i][j - 1] == 1) //horizontal2
                    {
                        player1++;

                        if (j - 2 >= 0 && game[i][j - 2] == 1)
                        {
                            player1++;
                        } else
                            {
                                player1 = 0;
                        }
                    } else
                        {
                            player1 = 0;
                    }

                    if(player1 == 2)
                    {
                        Winner.setText("player 1 wins!");
                        return;
                    }

                    if (i + 1 <= 2 && game[i+1][j] == 1) //vertical
                    {
                        player1++;

                        if (i + 2 <= 2 && game[i+2][j] == 1)
                        {
                            player1++;
                        } else {
                            player1 = 0;
                        }
                    } else
                    {
                        player1 = 0;
                    }

                    if(player1 == 2)
                    {
                        Winner.setText("player 1 wins!");
                        return;
                    }

                    if (i - 1 >= 0 && game[i-1][j] == 1) //vertical2
                    {
                        player1++;

                        if (i - 2 >= 0 && game[i-2][j] == 1)
                        {
                            player1++;
                        } else {
                            player1 = 0;
                        }
                    } else
                    {
                        player1 = 0;
                    }

                    if(player1 == 2)
                    {
                        Winner.setText("player 1 wins!");
                        return;
                    }

                    if (i+1<=2 && j + 1 <= 2 && game[i+1][j +1] == 1) //diagonal
                    {
                        player1++;

                        if (i+2<=2 && j + 2 <= 2 && game[i + 2][j + 2] == 1)
                        {
                            player1++;
                        } else
                        {
                            player1 = 0;
                        }
                    } else
                    {
                        player1 = 0;
                    }

                    if(player1 == 2)
                    {
                        Winner.setText("player 1 wins!");
                        return;
                    }

                    if (i-1>=0 && j - 1 >= 0 && game[i-1][j -1] == 1) //diagonal2
                    {
                        player1++;

                        if (i-2>=0 && j - 2 >= 0 && game[i - 2][j - 2] == 1)
                        {
                            player1++;
                        } else
                        {
                            player1 = 0;
                        }
                    } else
                    {
                        player1 = 0;
                    }

                    if(player1 == 2)
                    {
                        Winner.setText("player 1 wins!");
                        return;
                    }
                }

                if(game[i][j] == 2)
                {
                    if (j + 1 <= 2 && game[i][j + 1] == 2) //horizontal
                    {
                        player2++;

                        if (j + 2 <= 2 && game[i][j + 2] == 2)
                        {
                            player2++;
                        } else {
                            player2 = 0;
                        }
                    } else
                    {
                        player2 = 0;
                    }

                    if(player2 == 2)
                    {
                        Winner.setText("player 2 wins!");
                        return;
                    }

                    if (j - 1 >= 0 && game[i][j - 1] == 2) //horizontal2
                    {
                        player2++;

                        if (j - 2 >= 0 && game[i][j - 2] == 2)
                        {
                            player2++;
                        } else
                        {
                            player2 = 0;
                        }
                    } else
                    {
                        player2 = 0;
                    }

                    if(player2 == 2)
                    {
                        Winner.setText("player 2 wins!");
                        return;
                    }

                    if (i + 1 <= 2 && game[i+1][j] == 2) //vertical
                    {
                        player2++;

                        if (i + 2 <= 2 && game[i+2][j] == 2)
                        {
                            player2++;
                        } else {
                            player2 = 0;
                        }
                    } else
                    {
                        player2 = 0;
                    }

                    if(player2 == 2)
                    {
                        Winner.setText("player 2 wins!");
                        return;
                    }

                    if (i - 1 >= 0 && game[i-1][j] == 2) //vertical2
                    {
                        player2++;

                        if (i - 2 >= 0 && game[i-2][j] == 2)
                        {
                            player2++;
                        } else {
                            player2 = 0;
                        }
                    } else
                    {
                        player2 = 0;
                    }

                    if(player2 == 2)
                    {
                        Winner.setText("player 2 wins!");
                        return;
                    }

                    if (i+1<=2 && j + 1 <= 2 && game[i+1][j +1] == 2) //diagonal
                    {
                        player2++;

                        if (i+2<=2 && j + 2 <= 2 && game[i + 2][j + 2] == 2)
                        {
                            player2++;
                        } else
                        {
                            player2 = 0;
                        }
                    } else
                    {
                        player2 = 0;
                    }

                    if(player2 == 2)
                    {
                        Winner.setText("player 2 wins!");
                        return;
                    }

                    if (i-1>=0 && j - 1 >= 0 && game[i-1][j -1] == 2) //diagonal
                    {
                        player2++;

                        if (i-2>=0 && j - 2 >= 0 && game[i - 2][j - 2] == 2)
                        {
                            player2++;
                        } else
                        {
                            player2 = 0;
                        }
                    } else
                    {
                        player2 = 0;
                    }

                    if(player2 == 2)
                    {
                        Winner.setText("player 2 wins!");
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                game[i][j] = 0;
            }
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1x1);
        imageView2 = findViewById(R.id.imageView1x);
        imageView3 = findViewById(R.id.imageView1x2);
        imageView4 = findViewById(R.id.imageView1x3);
        imageView5 = findViewById(R.id.imageView1x4);
        imageView6 = findViewById(R.id.imageView1x5);
        imageView7 = findViewById(R.id.imageView1x6);
        imageView8 = findViewById(R.id.imageView1x7);
        imageView9 = findViewById(R.id.imageView1x8);

        Winner = findViewById(R.id.textViewWinner);

        turn = true;

        imageView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView1.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[0][0] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView1.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[0][0] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView2.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[0][1] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView2.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[0][1] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView3.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[0][2] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView3.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[0][2] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[1][0] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[1][0] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[1][1] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[1][1] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView6.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[1][2] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView6.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[1][2] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[2][0] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[2][0] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView8.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[2][1] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView8.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[2][1] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(turn == true)
                {
                    imageView9.setImageDrawable(getResources().getDrawable(R.drawable.ic_dot));
                    game[2][2] = 1;
                    turn = false;
                    counts++;

                    CheckWinner();
                }
                else
                {
                    imageView9.setImageDrawable(getResources().getDrawable(R.drawable.ic_multiply));
                    game[2][2] = 2;
                    turn = true;
                    counts++;

                    CheckWinner();
                }
            }
        });
    }
}
