package eduardo.caballer.ejemplo3cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADO", "6 - Estoy en el estado Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADO", "5 - Estoy en el estado Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADO", "4 - Estoy en el estado Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADO", "3 - Estoy en el estado Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADO", "2 - Estoy en el estado Start");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADO", "1 - Estoy en el estado Create");
    }
}