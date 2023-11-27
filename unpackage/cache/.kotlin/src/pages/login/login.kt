package uni.UNIA088341;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.redirectTo as uni_redirectTo;
open class GenPagesLoginLogin : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onPageShow(fun() {}, instance);
    }
    @Suppress("UNUSED_PARAMETER")
    override fun `$render`(): VNode? {
        val _ctx = this;
        val _component_button = resolveComponent("button");
        val _component_bgani = resolveEasyComponent("bgani", GenComponentsBganiBganiClass);
        return createVNode(_component_bgani, null, utsMapOf("default" to withCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "conTitle"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "text"), "链"),
                        createElementVNode("text", utsMapOf("class" to "text"), "式"),
                        createElementVNode("text", utsMapOf("class" to "text"), "反"),
                        createElementVNode("text", utsMapOf("class" to "text"), "应")
                    )),
                    createElementVNode("view", utsMapOf("class" to "userIpt flexCenter"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "userIpttxt", "type" to "text", "placeholder-class" to "placeholderClass", "placeholder" to "请输入用户名", "modelValue" to _ctx.loginInfo.username, "onInput" to fun(`$event`: InputEvent): Any {
                            _ctx.loginInfo.username = `$event`.detail.value;
                            return `$event`.detail.value;
                        }
                        ), null, 40, utsArrayOf(
                            "modelValue",
                            "onInput"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "passIpt flexCenter"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "passIpttxt", "type" to "password", "placeholder-class" to "placeholderClass", "placeholder" to "请输入密码", "modelValue" to _ctx.loginInfo.password, "onInput" to fun(`$event`: InputEvent): Any {
                            _ctx.loginInfo.password = `$event`.detail.value;
                            return `$event`.detail.value;
                        }
                        ), null, 40, utsArrayOf(
                            "modelValue",
                            "onInput"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "btnbox"), utsArrayOf(
                        createVNode(_component_button, utsMapOf("onClick" to _ctx.loginHandle, "class" to "loginBtn", "type" to "button"), utsMapOf("default" to withCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                "登录"
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "onClick"
                        ))
                    ))
                ))
            );
        }
        ), "_" to 1));
    }
    open var loginInfo: loginInfo by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("loginInfo" to loginInfo(username = "", password = ""));
    }
    override fun `$initMethods`() {
        this.loginHandle = fun() {
            console.log("loginStart", " at pages/login/login.uvue:48");
            uni_redirectTo(RedirectToOptions(url = "/pages/index/index"));
        }
        ;
    }
    open lateinit var loginHandle: () -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("flexCenter" to utsMapOf("" to utsMapOf("display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "content" to utsMapOf("" to utsMapOf("width" to "750rpx", "height" to "100%", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "conTitle" to utsMapOf(".content " to utsMapOf("width" to "400rpx", "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-around", "alignItems" to "center", "marginTop" to "-70rpx")), "text" to utsMapOf(".content .conTitle " to utsMapOf("fontWeight" to "700", "fontSize" to "84rpx", "color" to "#ffffff")), "userIpt" to utsMapOf(".content " to utsMapOf("width" to "540rpx", "height" to "70rpx", "borderWidth" to "2rpx", "borderStyle" to "solid", "borderColor" to "#ffffff", "borderRadius" to "14rpx", "padding" to "12rpx 16rpx", "marginTop" to "90rpx", "boxShadow" to "5rpx 5rpx 14rpx #333", "backgroundColor" to "#ffffff")), "userIpttxt" to utsMapOf(".content .userIpt " to utsMapOf("textAlign" to "center", "color" to "#333333")), "passIpt" to utsMapOf(".content " to utsMapOf("width" to "540rpx", "height" to "70rpx", "borderWidth" to "2rpx", "borderStyle" to "solid", "borderColor" to "#ffffff", "borderRadius" to "14rpx", "padding" to "12rpx 16rpx", "marginTop" to "40rpx", "backgroundColor" to "#ffffff", "boxShadow" to "5rpx 5rpx 14rpx #333")), "passIpttxt" to utsMapOf(".content .passIpt " to utsMapOf("textAlign" to "center", "color" to "#333333")), "btnbox" to utsMapOf(".content " to utsMapOf("marginTop" to "74rpx", "boxShadow" to "5rpx 5rpx 8rpx #333")), "loginBtn" to utsMapOf(".content .btnbox " to utsMapOf("width" to "540rpx", "color" to "#333333", "backgroundColor" to "#Ededed", "borderRadius" to "14rpx")), "placeholderClass" to utsMapOf("" to utsMapOf("color" to "#333333")));
            }
    }
}
