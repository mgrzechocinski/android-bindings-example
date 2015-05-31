package net.grzechocinski.android.bindings;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import net.grzechocinski.android.bindings.databinding.SampleBinding;

public class BindingDemoActivity extends Activity{

    private SampleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.sample);
        binding.setUser(new User("Foo", "Bar"));
    }
}
