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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesIndexIndex : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onLoad(fun(_: OnLoadOptions) {}, instance);
    }
    @Suppress("UNUSED_PARAMETER")
    override fun `$render`(): VNode? {
        val _ctx = this;
        val _component_button = resolveComponent("button");
        val _component_bgani = resolveEasyComponent("bgani", GenComponentsBganiBganiClass);
        return createVNode(_component_bgani, null, utsMapOf("default" to withCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "btnGroup"), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.btnList, fun(item, _, _): VNode {
                            return createElementVNode("view", utsMapOf("class" to "btnitem"), utsArrayOf(
                                createVNode(_component_button, utsMapOf("onClick" to fun(){
                                    _ctx.navTo(item.id);
                                }
                                , "type" to "button", "style" to normalizeStyle(utsMapOf("border-radius" to "14rpx", "background-color" to item.btnColor, "color" to item.txtColor))), utsMapOf("default" to withCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        toDisplayString(item.btnName)
                                    );
                                }
                                ), "_" to 2), 1032, utsArrayOf(
                                    "onClick",
                                    "style"
                                ))
                            ));
                        }
                        ), 256)
                    ))
                ))
            );
        }
        ), "_" to 1));
    }
    open var btnList: UTSArray<btnItem> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("btnList" to utsArrayOf<btnItem>(btnItem(id = 1, btnName = "探险/探索故事", btnColor = "linear-gradient(to right, #eee, #333)", txtColor = "#fff"), btnItem(id = 2, btnName = "武侠/古代故事", btnColor = "linear-gradient(to left, #eee, #333)", txtColor = "#fff")));
    }
    override fun `$initMethods`() {
        this.navTo = fun(id: Number) {
            uni_navigateTo(NavigateToOptions(url = "/pages/chatView/chatView?id=" + id));
        }
        ;
    }
    open lateinit var navTo: (id: Number) -> Unit;
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
                return utsMapOf("content" to utsMapOf("" to utsMapOf("display" to "flex", "alignItems" to "center", "justifyContent" to "center")), "btnGroup" to utsMapOf("" to utsMapOf("width" to "750rpx", "height" to "100%", "padding" to "45rpx", "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-around", "alignItems" to "center")), "btnitem" to utsMapOf(".btnGroup " to utsMapOf("margin" to "15rpx 0", "boxShadow" to "4rpx 4rpx 24rpx #333")));
            }
    }
}
