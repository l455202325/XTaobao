package com.xiaoguang.xtaobao.contract;

import android.widget.EditText;
import android.widget.TextView;

import com.xiaoguang.xtaobao.base.BasePresenter;
import com.xiaoguang.xtaobao.base.BaseView;

/**
 * 契约类、使view 和 Presenter 之前的方法清晰
 * Created by 11655 on 2016/10/18.
 */

public class IRegisterContract {
   public interface IIRegisterView extends BaseView<IIRegisterPrensenter>{

       EditText getmActHomeEtPhone();

       EditText getmActHomeEtSmsCode();

       EditText getmActHomeEtNickName();

       EditText getmActRegEtPwd();

       EditText getmActRegEtPwd2();

       TextView getmFragRegisterTvGetcode();

       /**
        * Toast数据
        * @param msg
        */
       void showMsg(String msg);

       /**
        * 展示一个进度条对话框
        * @param title 标题
        * @param msg 显示的内容
        * @param flag 是否可以取消
        */
       void showLoadingDialog(String title, String msg, boolean flag);

       /**
        * 取消进度条
        */
       void canelLoadingDialog();

       /**
        * activity的跳转
        */
       void jumpActivity();
   }
    public interface IIRegisterPrensenter extends BasePresenter<IIRegisterView>{
        /**
         * 获取验证码
         */
        void getCode();

        /**
         * 注册账号
         */
        void register();
    }
}
