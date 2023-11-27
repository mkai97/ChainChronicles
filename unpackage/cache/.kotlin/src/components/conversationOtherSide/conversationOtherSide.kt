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
open class GenComponentsConversationOtherSideConversationOtherSide : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    @Suppress("UNUSED_PARAMETER")
    override fun `$render`(): VNode? {
        val _ctx = this;
        return createElementVNode("view", utsMapOf("class" to "cvebg"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "avatar"), utsArrayOf(
                createElementVNode("image", utsMapOf("class" to "avatarImg", "src" to "../../static/logo.png", "mode" to "scaleToFill"))
            )),
            createElementVNode("view", utsMapOf("class" to "chatCont"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "cvTime"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "cvTimeTxt"), toDisplayString(_ctx.cve0.createTime), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                    createElementVNode("rich-text", utsMapOf("nodes" to _ctx.cve0.content), null, 8, utsArrayOf(
                        "nodes"
                    ))
                ))
            ))
        ));
    }
    open var cve0: cve1 by `$props`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf();
    }
    companion object {
        var props = normalizePropsOptions(utsMapOf("cve0" to utsMapOf("type" to "Object", "default" to fun(): cve1 {
            return (cve1(id = "1", createTime = "2023-11-23", fromUser = "100", toUser = "100", content = "<div>StringStringStringStringStringStringStringStringStringStringStringStringStringStringStringString</div><div>666</div>", contType = "text", isSelf = 1));
        }
        )));
        var propsNeedCastKeys = utsArrayOf(
            "cve0"
        );
        var name = "conversationOtherSide";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("cvebg" to utsMapOf("" to utsMapOf("width" to "750rpx", "display" to "flex", "flexDirection" to "row", "justifyContent" to "flex-start", "alignItems" to "flex-start")), "avatar" to utsMapOf(".cvebg " to utsMapOf("width" to "120rpx", "height" to "120rpx", "display" to "flex", "justifyContent" to "center", "alignItems" to "center", "margin" to "0 12rpx")), "avatarImg" to utsMapOf(".cvebg " to utsMapOf("width" to "90rpx", "height" to "90rpx", "borderRadius" to "50rpx")), "chatCont" to utsMapOf(".cvebg " to utsMapOf("width" to "520rpx", "display" to "flex", "flexDirection" to "column", "justifyContent" to "flex-start", "alignItems" to "flex-start")), "cvTime" to utsMapOf(".cvebg .chatCont " to utsMapOf("width" to "100%", "height" to "60rpx", "display" to "flex", "flexDirection" to "column", "justifyContent" to "flex-start", "alignItems" to "flex-start", "marginTop" to "20rpx")), "cvTimeTxt" to utsMapOf(".cvebg .chatCont .cvTime " to utsMapOf("fontSize" to "24rpx", "color" to "#cccccc")), "content" to utsMapOf(".cvebg .chatCont " to utsMapOf("backgroundColor" to "#daf8d4", "width" to "400rpx", "minHeight" to "10rpx", "borderRadius" to "24rpx", "padding" to "25rpx")));
            }
    }
}
