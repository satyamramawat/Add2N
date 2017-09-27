package a4mca.add2n;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    ImageButton imgA,imgB,imgC,imgD,ofF;

    int zero=0;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Switch s1 = (Switch) findViewById(R.id.switch1);
        ofF =(ImageButton)findViewById(R.id.ofF);//ON-OFF SWITCH BUTTON
        ofF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "TATA !! BYE BYE ", 50000).show(); //Toast.LENGTH_LONG //
                finish();
            }
        });
//ADDITION
        imgA =(ImageButton)findViewById(R.id.imgA);
        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
               add(View);

            }
        });

 //SUBTRACTION
        imgB =(ImageButton)findViewById(R.id.imgB);
        imgB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                sub(View);

            }
        });
  //MULTIPLICATION
        imgC =(ImageButton)findViewById(R.id.imgC);
        imgC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                mul(View);

            }
        });
 //DIVISION
        imgD =(ImageButton)findViewById(R.id.imgD);
        imgD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                div(View);

            }
        });

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    // this function will be called on button click property
    public void add(View v) {
// casting two edit text box to a variable.
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);

//converting the numbers in textbox to integer  and store it in the varibales
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
//add the two numbers.
        if(num1 == zero && num2 == zero)
        {
            Toast.makeText(MainActivity.this, "Please Enter Value ", Toast.LENGTH_LONG).show();
        }
        else if(num1 == zero)
        {
            Toast.makeText(MainActivity.this, "1st value 0 has been taken ", Toast.LENGTH_LONG).show();
            int sum = num1 + num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else if(num2 == zero)
        {
            Toast.makeText(MainActivity.this, "2nd value 0 has been taken ", Toast.LENGTH_LONG).show();
            int sum = num1 + num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else {
            int sum = num1 + num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }

    }

    public void sub(View v) {
// casting two edit text box to a variable.
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
//converting the numbers in textbox to integer  and store it in the varibales
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
//add the two numbers.
        if(num1 == zero && num2 == zero)
        {
            Toast.makeText(MainActivity.this, "Please Enter Values ", Toast.LENGTH_LONG).show();
        }
        else if(num1 == zero)
        {
            Toast.makeText(MainActivity.this, "1st value 0 has been taken ", Toast.LENGTH_LONG).show();
            int sum = num1 - num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else if(num2 == zero)
        {
            Toast.makeText(MainActivity.this, "2nd value 0 has been taken ", Toast.LENGTH_LONG).show();
            int sum = num1 - num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else {
            int sum = num1 - num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }

    }

    public void mul(View v) {
// casting two edit text box to a variable.
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
//converting the numbers in textbox to integer  and store it in the varibales
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
//add the two numbers.
        if(num1 == zero && num2 == zero)
        {
            Toast.makeText(MainActivity.this, "Please Enter Value ", Toast.LENGTH_LONG).show();
        }
        else if(num1 == zero)
        {
            Toast.makeText(MainActivity.this, "1st value 0 has been taken ", Toast.LENGTH_LONG).show();
            int sum = num1 * num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else if(num2 == zero)
        {
            Toast.makeText(MainActivity.this, "2nd value 0 has been taken ", Toast.LENGTH_LONG).show();
            int sum = num1 * num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else {
            int sum = num1 * num2;
            // display the numbers in the text box
            t1.setText(Integer.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }

    }

    public void div(View v) {
// casting two edit text box to a variable.
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
//converting the numbers in textbox to integer  and store it in the varibales
        Float num1 = Float.parseFloat(e1.getText().toString());
        Float num2 = Float.parseFloat(e2.getText().toString());

        if(num1 == zero && num2 == zero)
        {
            Toast.makeText(MainActivity.this, "Please Enter Value ", Toast.LENGTH_LONG).show();
        }
        else if(num1 == zero)
        {
            Toast.makeText(MainActivity.this, "1st value 0 has been taken ", Toast.LENGTH_LONG).show();
            Float sum = num1 / num2;
            // display the numbers in the text box
            t1.setText(Float.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
        else if(num2 == zero)
        {
            Toast.makeText(MainActivity.this, "Error !! cannot divide "+num1+" with zero", Toast.LENGTH_LONG).show();

        }
        else {
            Float sum = num1 / num2;
            // display the numbers in the text box
            t1.setText(Float.toString(sum));

            //SPINNER
            final ProgressDialog progress;

            progress = new ProgressDialog(this);
            progress.setTitle("Please wait");
            progress.setMessage("Your answer is Ready");
            progress.setCancelable(true);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    progress.dismiss();
                }
            }, 1500);
        }
    }

    public void oninfo(View v) {
        TextView t1 = (TextView) findViewById(R.id.textView);
        String strText = "SATYAM RAMAWAT 1547249";
        t1.setText(strText);
    }

}


