package hjs.zhi.com.learnopengl;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // GLSurfaceView是一个视图，继承至SurfaceView，它内嵌的surface专门负责OpenGL渲染。
    // 更多GLSurfaceView信息见
    // http://120.132.134.205/cmdn/supesite/?uid-5358-action-viewspace-itemid-6527
    private GLSurfaceView glSurfaceView;

    // 这是渲染器(Render)的公共接口，它的任务就是调用OpenGL的API来作帧的渲染。
    // 更多MyRenderer信息见
    // http://dev.10086.cn/cmdn/supesite/?uid-5358-action-viewspace-itemid-6528
    private MyRenderer renderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 实例化MyRenderer,GLSurfaceView类
        renderer = new MyRenderer();
        glSurfaceView = new GLSurfaceView(this);
        // 设置渲染器
        glSurfaceView.setRenderer(renderer);
        // 为当前Activity类指定视图
        setContentView(glSurfaceView);
    }
}
