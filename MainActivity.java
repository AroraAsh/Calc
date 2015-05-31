package com.example.ashwinarora.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Calculator extends Activity {

    public static String num = "" ;
    public static String number = "" ;
    public static int oper;
    public static float num1 = 0;
    public static float num2 = 0;
    public static float res = 0;
    public static String result = "";
    public static int count;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnDecimal;
    Button btnEqual;
    Button btnClear;

    EditText tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btnAdd = (Button) findViewById(R.id.plus);
        btnSub = (Button) findViewById(R.id.minus);
        btnMult = (Button) findViewById(R.id.multiply);
        btnDiv = (Button) findViewById(R.id.divide);
        btnOne = (Button) findViewById(R.id.one);
        btnTwo = (Button) findViewById(R.id.two);
        btnThree = (Button) findViewById(R.id.three);
        btnFour = (Button) findViewById(R.id.four);
        btnFive = (Button) findViewById(R.id.five);
        btnSix = (Button) findViewById(R.id.six);
        btnSeven = (Button) findViewById(R.id.seven);
        btnEight = (Button) findViewById(R.id.eight);
        btnNine = (Button) findViewById(R.id.nine);
        btnZero = (Button) findViewById(R.id.zero);
        btnDecimal = (Button) findViewById(R.id.decimal);
        btnEqual = (Button) findViewById(R.id.equal);
        btnClear = (Button) findViewById(R.id.clear);
        tvResult = (EditText) findViewById(R.id.resultView);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = "";
                number = "";
                result = "0";
                count = 0;
                tvResult.setText(result);
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(number);
                String res2;
                switch (oper){
                    case 0:
                        res = num1 + num2;
                        res2 = String.valueOf(res);
                        result = res2;
                        break;

                    case 1:
                        res = num1 - num2;
                        res2 = String.valueOf(res);
                        result = res2;
                        break;

                    case 2:
                        res = num1 * num2;
                        res2 = String.valueOf(res);
                        result = res2;
                        break;

                    case 3:
                        res = num1/num2;
                        res2 = String.valueOf(res);
                        result = res2;
                        break;
                }

                tvResult.setText(result);

            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnZero.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnZero.getText().toString());

                    tvResult.setText(result + number);
                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnOne.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnOne.getText().toString());
                    ////result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnTwo.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnTwo.getText().toString());
                    ////result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnThree.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnThree.getText().toString());
                    ////result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnFour.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnFour.getText().toString());
                    ////result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnFive.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnFive.getText().toString());
                    //result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnSix.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnSix.getText().toString());
                    //result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnSeven.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnSeven.getText().toString());
                    //result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnEight.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnEight.getText().toString());
                    //result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnNine.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnNine.getText().toString());
                    //result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count!=1) {
                    num = num.concat(btnDecimal.getText().toString());
                    result = num;
                    tvResult.setText(result);
                }
                else {
                    number = number.concat(btnDecimal.getText().toString());
                    //result = result + number;
                    tvResult.setText(result + number);
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(num);
                result = num + "+";
                //result.clear();
                oper = 0;
                count = 1;
                tvResult.setText(result);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(num);
                result = num + btnSub.getText().toString();
                //result.clear();
                oper = 1;
                count = 1;
                tvResult.setText(result);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(num);
                result = num + btnMult.getText().toString();
                //result.clear();
                oper = 2;
                count = 1;
                tvResult.setText(result);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(num);
                result = num + btnDiv.getText().toString();
                //result.clear();
                oper = 3;
                count = 1;
                tvResult.setText(result);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
