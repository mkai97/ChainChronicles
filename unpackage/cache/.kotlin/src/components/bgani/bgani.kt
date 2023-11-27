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
open class GenComponentsBganiBgani : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onCreated(fun() {
            this.radImg();
        }
        , instance);
    }
    @Suppress("UNUSED_PARAMETER")
    override fun `$render`(): VNode? {
        val _ctx = this;
        return createElementVNode("view", utsMapOf("class" to "outbg"), utsArrayOf(
            createElementVNode("image", utsMapOf("class" to "bgimg", "src" to _ctx.currentUrl, "mode" to "aspectFill"), null, 8, utsArrayOf(
                "src"
            )),
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("opacity" to _ctx.opacity)), "class" to "login_bg"), utsArrayOf(
                renderSlot(_ctx.`$slots`, "default")
            ), 4)
        ));
    }
    open var opacity: Number by `$props`;
    open var urls: UTSArray<String> by `$data`;
    open var currentUrl: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("urls" to utsArrayOf(
            "http://qn.mkai97.cn/appstatic/ddf37eef063b1523cbc2b3b6aa8840e0.jpg",
            "http://qn.mkai97.cn/appstatic/2242645049.gif",
            "http://qn.mkai97.cn/appstatic/mmexport1685954969368.jpg",
            "http://qn.mkai97.cn/appstatic/11ac618126564008f716c505cf196a73.jpg",
            "http://qn.mkai97.cn/appstatic/2242645049.gif",
            "http://qn.mkai97.cn/appstatic/47a7b6f776c742ffcefd768553174b0b.jpg",
            "http://qn.mkai97.cn/appstatic/b88f432ce3723432bb730ffcc224b1dc.jpg",
            "http://qn.mkai97.cn/appstatic/ddf37eef063b1523cbc2b3b6aa8840e0.jpg",
            "http://qn.mkai97.cn/appstatic/mmexport1685954969368.jpg"
        ), "currentUrl" to "http://qn.mkai97.cn/appstatic/ddf37eef063b1523cbc2b3b6aa8840e0.jpg");
    }
    override fun `$initMethods`() {
        this.radImg = fun() {
            var randomNum = Math.floor(Math.random() * this.urls.length);
            this.currentUrl = this.urls[randomNum];
        }
        ;
    }
    open lateinit var radImg: () -> Unit;
    companion object {
        var props = normalizePropsOptions(utsMapOf("opacity" to utsMapOf("type" to "Number", "default" to 0.8)));
        var propsNeedCastKeys = utsArrayOf(
            "opacity"
        );
        var name = "bgani";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("outbg" to utsMapOf("" to utsMapOf("width" to "750rpx", "height" to "100%", "position" to "relative")), "login_bg" to utsMapOf("" to utsMapOf("position" to "absolute", "top" to 0, "bottom" to 0, "right" to 0, "left" to 0, "width" to "750rpx", "height" to "100%", "backgroundImage" to "linear-gradient(to bottom right, #FFF, #333)", "opacity" to 0.8)), "bgimg" to utsMapOf("" to utsMapOf("width" to "750rpx", "height" to "100%")));
            }
    }
}
