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
open class GenPagesChatViewChatView : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onLoad(fun(_: OnLoadOptions) {
            setTimeout(fun(){
                this.toBottom();
            }
            , 300);
        }
        , instance);
    }
    @Suppress("UNUSED_PARAMETER")
    override fun `$render`(): VNode? {
        val _ctx = this;
        val _component_cve = resolveComponent("cve");
        val _component_cveo = resolveComponent("cveo");
        val _component_button = resolveComponent("button");
        return createElementVNode("view", utsMapOf("class" to "cvbg"), utsArrayOf(
            createElementVNode("scroll-view", utsMapOf("refresher-triggered" to _ctx.refresherTriggered, "onRefresherrefresh" to _ctx.getMoreCve, "refresher-enabled" to true, "scroll-top" to _ctx.scrollTop, "style" to "flex:1;background-color: #f7f7f7;"), utsArrayOf(
                createVNode(_component_cve),
                createVNode(_component_cveo),
                createElementVNode("view", utsMapOf("id" to "msgbottom", "style" to "height: 160rpx;"))
            ), 40, utsArrayOf(
                "refresher-triggered",
                "onRefresherrefresh",
                "scroll-top"
            )),
            createElementVNode("view", utsMapOf("class" to "cveiptBox"), utsArrayOf(
                createElementVNode("textarea", utsMapOf("class" to "cveipt", "cursor-spacing" to "20", "name" to "cveipt", "id" to "cveipt", "fixed" to true, "auto-height" to true)),
                createVNode(_component_button, utsMapOf("onClick" to _ctx.sendMsg, "class" to "sendBtn"), utsMapOf("default" to withCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        "发送"
                    );
                }
                ), "_" to 1), 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ));
    }
    open var scrollTop: Number by `$data`;
    open var refresherTriggered: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("scrollTop" to 0, "refresherTriggered" to false);
    }
    override fun `$initMethods`() {
        this.toBottom = fun() {
            this.scrollTop = 999999;
        }
        ;
        this.getMoreCve = fun() {
            this.refresherTriggered = true;
            setTimeout(fun(){
                this.refresherTriggered = false;
            }
            , 2000);
        }
        ;
        this.sendMsg = fun() {};
    }
    open lateinit var toBottom: () -> Unit;
    open lateinit var getMoreCve: () -> Unit;
    open lateinit var sendMsg: () -> Unit;
    companion object {
        var components = utsMapOf<String, CreateVueComponent>("cve" to GenComponentsConversationConversationClass, "cveo" to GenComponentsConversationOtherSideConversationOtherSideClass);
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
                return utsMapOf("cvbg" to utsMapOf("" to utsMapOf("width" to "750rpx", "height" to "100%", "backgroundColor" to "#f7f7f7", "borderTopWidth" to "2rpx", "borderTopStyle" to "solid", "borderTopColor" to "#f2f2f2")), "cveiptBox" to utsMapOf("" to utsMapOf("position" to "fixed", "bottom" to 0, "left" to 0, "right" to 0, "backgroundColor" to "#ffffff", "minHeight" to "90rpx", "padding" to "20rpx 24rpx", "display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "space-around")), "cveipt" to utsMapOf(".cveiptBox " to utsMapOf("width" to "70%", "padding" to "12rpx", "backgroundColor" to "#f7f7f7")), "sendBtn" to utsMapOf(".cveiptBox " to utsMapOf("width" to "120rpx", "height" to "70rpx", "paddingLeft" to 0, "paddingRight" to 0, "paddingTop" to 0, "paddingBottom" to 0, "lineHeight" to "70rpx", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "color" to "#ffffff", "backgroundColor" to "#333333")));
            }
    }
}
