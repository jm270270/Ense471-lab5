package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b0 = (Button)findViewById(R.id.b0);
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        Button b5 = (Button)findViewById(R.id.b5);
        Button b6 = (Button)findViewById(R.id.b6);
        Button b7 = (Button)findViewById(R.id.b7);
        Button b8 = (Button)findViewById(R.id.b8);
        Button b9 = (Button)findViewById(R.id.b9);
        Button delete = (Button)findViewById(R.id.delete);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button times = (Button)findViewById(R.id.times);
        Button divide = (Button)findViewById(R.id.divide);
        Button left = (Button)findViewById(R.id.left);
        Button right = (Button)findViewById(R.id.right);
        Button point = (Button)findViewById(R.id.point);
        Button equal = (Button)findViewById(R.id.equal);

        b0.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("0");
                    }
                }
        );
        b1.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("1");
                    }
                }
        );
        b2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("2");
                    }
                }
        );
        b3.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("3");
                    }
                }
        );
        b4.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("4");
                    }
                }
        );
        b5.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("5");
                    }
                }
        );
        b6.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("6");
                    }
                }
        );
        b7.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("7");
                    }
                }
        );
        b8.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("8");
                    }
                }
        );
        b9.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("9");
                    }
                }
        );
        left.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("(");
                    }
                }
        );
        right.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append(")");
                    }
                }
        );
        plus.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("+");
                    }
                }
        );
        minus.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("-");
                    }
                }
        );
        times.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("X");
                    }
                }
        );
        divide.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("/");
                    }
                }
        );
        point.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append(".");
                    }
                }
        );
        equal.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.append("=");
                    }
                }
        );
        delete.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView) findViewById(R.id.Output);
                        output.setText("");
                    }
                }
        );


    }

}
