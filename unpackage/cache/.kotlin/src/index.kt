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
import io.dcloud.uniapp.appframe.AppConfig;
import io.dcloud.uniapp.vue.createSSRApp;
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
var firstBackTime: Number = 0;
open class GenApp : BaseApp {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onLaunch(fun(_: OnLaunchOptions) {
            console.log("App Launch", " at App.uvue:5");
        }
        , instance);
        onAppShow(fun(_: OnShowOptions) {
            console.log("App Show", " at App.uvue:8");
        }
        , instance);
        onHide(fun() {
            console.log("App Hide", " at App.uvue:11");
        }
        , instance);
        onLastPageBackPress(fun() {
            console.log("App LastPageBackPress", " at App.uvue:14");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , instance);
        onExit(fun() {
            console.log("App Exit", " at App.uvue:30");
        }
        , instance);
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-row" to utsMapOf("" to utsMapOf("flexDirection" to "row")), "uni-column" to utsMapOf("" to utsMapOf("flexDirection" to "column")));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = true, props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
val GenComponentsBganiBganiClass = CreateVueComponent(GenComponentsBganiBgani::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = GenComponentsBganiBgani.name, inheritAttrs = true, props = GenComponentsBganiBgani.props, propsNeedCastKeys = GenComponentsBganiBgani.propsNeedCastKeys, emits = Map(), components = Map(), styles = GenComponentsBganiBgani.styles);
}
, fun(instance): GenComponentsBganiBgani {
    return GenComponentsBganiBgani(instance);
}
);
open class loginInfo (
    @JsonNotNull
    open var username: String,
    @JsonNotNull
    open var password: String,
) : UTSObject()
open class loginInfoReactiveObject : loginInfo, IUTSReactive<loginInfo> {
    override var __v_raw: loginInfo;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    constructor(__v_raw: loginInfo, __v_isReadonly: Boolean, __v_isShallow: Boolean) : super(username = __v_raw.username, password = __v_raw.password) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
    }
    override var username: String
        get() {
            return trackReactiveGet(__v_raw, "username", __v_raw.username);
        }
        set(value) {
            val oldValue = __v_raw.username;
            __v_raw.username = value;
            triggerReactiveSet(__v_raw, "username", oldValue, value);
        }
    override var password: String
        get() {
            return trackReactiveGet(__v_raw, "password", __v_raw.password);
        }
        set(value) {
            val oldValue = __v_raw.password;
            __v_raw.password = value;
            triggerReactiveSet(__v_raw, "password", oldValue, value);
        }
}
val GenPagesLoginLoginClass = CreateVueComponent(GenPagesLoginLogin::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = true, props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenPagesLoginLogin.styles);
}
, fun(instance): GenPagesLoginLogin {
    return GenPagesLoginLogin(instance);
}
);
open class btnItem (
    @JsonNotNull
    open var id: Number,
    @JsonNotNull
    open var btnName: String,
    @JsonNotNull
    open var btnColor: String,
    @JsonNotNull
    open var txtColor: String,
) : UTSObject()
open class btnItemReactiveObject : btnItem, IUTSReactive<btnItem> {
    override var __v_raw: btnItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    constructor(__v_raw: btnItem, __v_isReadonly: Boolean, __v_isShallow: Boolean) : super(id = __v_raw.id, btnName = __v_raw.btnName, btnColor = __v_raw.btnColor, txtColor = __v_raw.txtColor) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
    }
    override var id: Number
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id);
        }
        set(value) {
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var btnName: String
        get() {
            return trackReactiveGet(__v_raw, "btnName", __v_raw.btnName);
        }
        set(value) {
            val oldValue = __v_raw.btnName;
            __v_raw.btnName = value;
            triggerReactiveSet(__v_raw, "btnName", oldValue, value);
        }
    override var btnColor: String
        get() {
            return trackReactiveGet(__v_raw, "btnColor", __v_raw.btnColor);
        }
        set(value) {
            val oldValue = __v_raw.btnColor;
            __v_raw.btnColor = value;
            triggerReactiveSet(__v_raw, "btnColor", oldValue, value);
        }
    override var txtColor: String
        get() {
            return trackReactiveGet(__v_raw, "txtColor", __v_raw.txtColor);
        }
        set(value) {
            val oldValue = __v_raw.txtColor;
            __v_raw.txtColor = value;
            triggerReactiveSet(__v_raw, "txtColor", oldValue, value);
        }
}
val GenPagesIndexIndexClass = CreateVueComponent(GenPagesIndexIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = true, props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenPagesIndexIndex.styles);
}
, fun(instance): GenPagesIndexIndex {
    return GenPagesIndexIndex(instance);
}
);
open class cve (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var createTime: String,
    @JsonNotNull
    open var fromUser: String,
    @JsonNotNull
    open var toUser: String,
    @JsonNotNull
    open var content: String,
    @JsonNotNull
    open var contType: String,
    @JsonNotNull
    open var isSelf: Number,
) : UTSObject()
open class cveReactiveObject : cve, IUTSReactive<cve> {
    override var __v_raw: cve;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    constructor(__v_raw: cve, __v_isReadonly: Boolean, __v_isShallow: Boolean) : super(id = __v_raw.id, createTime = __v_raw.createTime, fromUser = __v_raw.fromUser, toUser = __v_raw.toUser, content = __v_raw.content, contType = __v_raw.contType, isSelf = __v_raw.isSelf) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id);
        }
        set(value) {
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var createTime: String
        get() {
            return trackReactiveGet(__v_raw, "createTime", __v_raw.createTime);
        }
        set(value) {
            val oldValue = __v_raw.createTime;
            __v_raw.createTime = value;
            triggerReactiveSet(__v_raw, "createTime", oldValue, value);
        }
    override var fromUser: String
        get() {
            return trackReactiveGet(__v_raw, "fromUser", __v_raw.fromUser);
        }
        set(value) {
            val oldValue = __v_raw.fromUser;
            __v_raw.fromUser = value;
            triggerReactiveSet(__v_raw, "fromUser", oldValue, value);
        }
    override var toUser: String
        get() {
            return trackReactiveGet(__v_raw, "toUser", __v_raw.toUser);
        }
        set(value) {
            val oldValue = __v_raw.toUser;
            __v_raw.toUser = value;
            triggerReactiveSet(__v_raw, "toUser", oldValue, value);
        }
    override var content: String
        get() {
            return trackReactiveGet(__v_raw, "content", __v_raw.content);
        }
        set(value) {
            val oldValue = __v_raw.content;
            __v_raw.content = value;
            triggerReactiveSet(__v_raw, "content", oldValue, value);
        }
    override var contType: String
        get() {
            return trackReactiveGet(__v_raw, "contType", __v_raw.contType);
        }
        set(value) {
            val oldValue = __v_raw.contType;
            __v_raw.contType = value;
            triggerReactiveSet(__v_raw, "contType", oldValue, value);
        }
    override var isSelf: Number
        get() {
            return trackReactiveGet(__v_raw, "isSelf", __v_raw.isSelf);
        }
        set(value) {
            val oldValue = __v_raw.isSelf;
            __v_raw.isSelf = value;
            triggerReactiveSet(__v_raw, "isSelf", oldValue, value);
        }
}
val GenComponentsConversationConversationClass = CreateVueComponent(GenComponentsConversationConversation::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = GenComponentsConversationConversation.name, inheritAttrs = true, props = GenComponentsConversationConversation.props, propsNeedCastKeys = GenComponentsConversationConversation.propsNeedCastKeys, emits = Map(), components = Map(), styles = GenComponentsConversationConversation.styles);
}
, fun(instance): GenComponentsConversationConversation {
    return GenComponentsConversationConversation(instance);
}
);
open class cve1 (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var createTime: String,
    @JsonNotNull
    open var fromUser: String,
    @JsonNotNull
    open var toUser: String,
    @JsonNotNull
    open var content: String,
    @JsonNotNull
    open var contType: String,
    @JsonNotNull
    open var isSelf: Number,
) : UTSObject()
open class cve1ReactiveObject : cve1, IUTSReactive<cve1> {
    override var __v_raw: cve1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    constructor(__v_raw: cve1, __v_isReadonly: Boolean, __v_isShallow: Boolean) : super(id = __v_raw.id, createTime = __v_raw.createTime, fromUser = __v_raw.fromUser, toUser = __v_raw.toUser, content = __v_raw.content, contType = __v_raw.contType, isSelf = __v_raw.isSelf) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id);
        }
        set(value) {
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var createTime: String
        get() {
            return trackReactiveGet(__v_raw, "createTime", __v_raw.createTime);
        }
        set(value) {
            val oldValue = __v_raw.createTime;
            __v_raw.createTime = value;
            triggerReactiveSet(__v_raw, "createTime", oldValue, value);
        }
    override var fromUser: String
        get() {
            return trackReactiveGet(__v_raw, "fromUser", __v_raw.fromUser);
        }
        set(value) {
            val oldValue = __v_raw.fromUser;
            __v_raw.fromUser = value;
            triggerReactiveSet(__v_raw, "fromUser", oldValue, value);
        }
    override var toUser: String
        get() {
            return trackReactiveGet(__v_raw, "toUser", __v_raw.toUser);
        }
        set(value) {
            val oldValue = __v_raw.toUser;
            __v_raw.toUser = value;
            triggerReactiveSet(__v_raw, "toUser", oldValue, value);
        }
    override var content: String
        get() {
            return trackReactiveGet(__v_raw, "content", __v_raw.content);
        }
        set(value) {
            val oldValue = __v_raw.content;
            __v_raw.content = value;
            triggerReactiveSet(__v_raw, "content", oldValue, value);
        }
    override var contType: String
        get() {
            return trackReactiveGet(__v_raw, "contType", __v_raw.contType);
        }
        set(value) {
            val oldValue = __v_raw.contType;
            __v_raw.contType = value;
            triggerReactiveSet(__v_raw, "contType", oldValue, value);
        }
    override var isSelf: Number
        get() {
            return trackReactiveGet(__v_raw, "isSelf", __v_raw.isSelf);
        }
        set(value) {
            val oldValue = __v_raw.isSelf;
            __v_raw.isSelf = value;
            triggerReactiveSet(__v_raw, "isSelf", oldValue, value);
        }
}
val GenComponentsConversationOtherSideConversationOtherSideClass = CreateVueComponent(GenComponentsConversationOtherSideConversationOtherSide::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = GenComponentsConversationOtherSideConversationOtherSide.name, inheritAttrs = true, props = GenComponentsConversationOtherSideConversationOtherSide.props, propsNeedCastKeys = GenComponentsConversationOtherSideConversationOtherSide.propsNeedCastKeys, emits = Map(), components = Map(), styles = GenComponentsConversationOtherSideConversationOtherSide.styles);
}
, fun(instance): GenComponentsConversationOtherSideConversationOtherSide {
    return GenComponentsConversationOtherSideConversationOtherSide(instance);
}
);
val GenPagesChatViewChatViewClass = CreateVueComponent(GenPagesChatViewChatView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = true, props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = GenPagesChatViewChatView.components, styles = GenPagesChatViewChatView.styles);
}
, fun(instance): GenPagesChatViewChatView {
    return GenPagesChatViewChatView(instance);
}
);
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    app.component("bgani", GenComponentsBganiBganiClass);
    return object : UTSJSONObject() {
        var app = app
    };
}
fun main(app: IApp) {
    defineAppConfig();
    definePageRoutes();
    (createApp()["app"] as VueApp).mount(app);
}
open class UniAppConfig : AppConfig {
    override var name: String = "ChainChronicles";
    override var appid: String = "__UNI__A088341";
    override var versionName: String = "1.0.0";
    override var versionCode: String = "1000";
    override var uniCompileVersion: String = "3.96";
    constructor(){}
}
fun definePageRoutes() {
    __uniRoutes.push(PageRoute(path = "pages/login/login", component = GenPagesLoginLoginClass, meta = PageMeta(isQuit = true), style = utsMapOf("navigationBarTitleText" to "登录", "enablePullDownRefresh" to false, "navigationStyle" to "custom")));
    __uniRoutes.push(PageRoute(path = "pages/index/index", component = GenPagesIndexIndexClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "链式")));
    __uniRoutes.push(PageRoute(path = "pages/chatView/chatView", component = GenPagesChatViewChatViewClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "链式", "enablePullDownRefresh" to false)));
}
val __uniTabBar: Map<String, Any?>? = null;
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/login/login", "style" to utsMapOf("navigationBarTitleText" to "登录", "enablePullDownRefresh" to false, "navigationStyle" to "custom"));
@Suppress("UNCHECKED_CAST")
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/login/login";
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "black", "navigationBarTitleText" to "链式", "navigationBarBackgroundColor" to "#F8F8F8", "backgroundColor" to "#F8F8F8");
    __uniConfig.tabBar = __uniTabBar as Map<String, Any>?;
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = Map();
}
fun getApp(): GenApp {
    return getBaseApp() as GenApp;
}
