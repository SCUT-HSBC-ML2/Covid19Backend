(function(t){function e(e){for(var a,i,l=e[0],c=e[1],d=e[2],u=0,f=[];u<l.length;u++)i=l[u],Object.prototype.hasOwnProperty.call(n,i)&&n[i]&&f.push(n[i][0]),n[i]=0;for(a in c)Object.prototype.hasOwnProperty.call(c,a)&&(t[a]=c[a]);s&&s(e);while(f.length)f.shift()();return o.push.apply(o,d||[]),r()}function r(){for(var t,e=0;e<o.length;e++){for(var r=o[e],a=!0,l=1;l<r.length;l++){var c=r[l];0!==n[c]&&(a=!1)}a&&(o.splice(e--,1),t=i(i.s=r[0]))}return t}var a={},n={app:0},o=[];function i(e){if(a[e])return a[e].exports;var r=a[e]={i:e,l:!1,exports:{}};return t[e].call(r.exports,r,r.exports,i),r.l=!0,r.exports}i.m=t,i.c=a,i.d=function(t,e,r){i.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:r})},i.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},i.t=function(t,e){if(1&e&&(t=i(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var r=Object.create(null);if(i.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)i.d(r,a,function(e){return t[e]}.bind(null,a));return r},i.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return i.d(e,"a",e),e},i.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},i.p="/";var l=window["webpackJsonp"]=window["webpackJsonp"]||[],c=l.push.bind(l);l.push=e,l=l.slice();for(var d=0;d<l.length;d++)e(l[d]);var s=c;o.push([0,"chunk-vendors"]),r()})({0:function(t,e,r){t.exports=r("56d7")},"034f":function(t,e,r){"use strict";var a=r("85ec"),n=r.n(a);n.a},"56d7":function(t,e,r){"use strict";r.r(e);r("e260"),r("e6cf"),r("cca6"),r("a79d");var a=r("2b0e"),n=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{attrs:{id:"app"}},[r("router-view")],1)},o=[],i=(r("034f"),r("2877")),l={},c=Object(i["a"])(l,n,o,!1,null,null,null),d=c.exports,s=r("8c4f"),u=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"wrapper"},[r("div",{attrs:{id:"nav"}},[r("h1",[t._v("累计确诊人数")]),r("router-link",{attrs:{to:"/"}},[t._v("累计确诊人数")]),t._v(" | "),r("router-link",{attrs:{to:"/NewConfirmed"}},[t._v("新增确诊人数")]),t._v(" | "),r("router-link",{attrs:{to:"/TotalDeath"}},[t._v("累计死亡人数")])],1),r("div",{staticClass:"chart",attrs:{id:"chart"}})])},f=[],h=(r("b0c0"),r("bc3a")),p=r.n(h),m=r("313e"),v=r.n(m),b={data:function(){return{}},props:{msg:{type:Object,default:function(){}}},watch:{msg:{deep:!0,handler:function(t){this.getWorld(t)}}},mounted:function(){this.getWorld(this.msg)},methods:{getWorld:function(t){var e=this;p.a.get("http://68.79.51.139:8888/echart/totalConfirmed").then((function(t){console.log(t);var r=t.data;e.drawChart(r)}))},drawChart:function(t){var e=v.a.init(document.getElementById("chart"));window.addEventListener("resize",(function(){e.resize()})),e.setOption({grid:{width:"100%",height:"100%",left:"0%",right:"0%",bottom:"0%",containLabel:!0},tooltip:{trigger:"item",formatter:function(t){if(null!=t.data)return t.data.name+": "+t.data.value}},visualMap:{min:0,max:15e5,text:["max","min"],realtime:!1,calculable:!0,color:["#ff0000","#ffffff"]},series:[{type:"map",name:"世界地图",mapType:"world",roam:!1,label:{show:!1},zoom:1.2,itemStyle:{borderWidth:.5,borderColor:"#000",borderType:"solid"},emphasis:{label:{show:!0,color:"auto"},itemStyle:{areaColor:"#476fff"}},data:t}]})}}},g=b,w=(r("dd6c"),Object(i["a"])(g,u,f,!1,null,"1c94c0dc",null)),y=w.exports,_=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"wrapper"},[r("div",{attrs:{id:"nav"}},[r("h1",[t._v("新增确诊人数")]),r("router-link",{attrs:{to:"/"}},[t._v("累计确诊人数")]),t._v(" | "),r("router-link",{attrs:{to:"/NewConfirmed"}},[t._v("新增确诊人数")]),t._v(" | "),r("router-link",{attrs:{to:"/TotalDeath"}},[t._v("累计死亡人数")])],1),r("div",{staticClass:"chart",attrs:{id:"chart"}})])},C=[],O={data:function(){return{}},props:{msg:{type:Object,default:function(){}}},watch:{msg:{deep:!0,handler:function(t){this.getWorld(t)}}},mounted:function(){this.getWorld(this.msg)},methods:{getWorld:function(t){var e=this;p.a.get("http://68.79.51.139:8888/echart/newConfirmed").then((function(t){console.log(t);var r=t.data;e.drawChart(r)}))},drawChart:function(t){var e=v.a.init(document.getElementById("chart"));window.addEventListener("resize",(function(){e.resize()})),e.setOption({grid:{width:"100%",height:"100%",left:"0%",right:"0%",bottom:"0%",containLabel:!0},tooltip:{trigger:"item",formatter:function(t){if(null!=t.data)return t.data.name+": "+t.data.value}},visualMap:{min:0,max:5e4,text:["max","min"],realtime:!1,calculable:!0,color:["#ff0000","#ffffff"]},series:[{type:"map",name:"世界地图",mapType:"world",roam:!1,label:{show:!1},zoom:1.2,itemStyle:{borderWidth:.5,borderColor:"#000",borderType:"solid"},emphasis:{label:{show:!0,color:"auto"},itemStyle:{areaColor:"#476fff"}},data:t}]})}}},x=O,j=(r("e0db"),Object(i["a"])(x,_,C,!1,null,"a6e7ad64",null)),T=j.exports,k=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"wrapper"},[r("div",{attrs:{id:"nav"}},[r("h1",[t._v("累计死亡人数")]),r("router-link",{attrs:{to:"/"}},[t._v("累计确诊人数")]),t._v(" | "),r("router-link",{attrs:{to:"/NewConfirmed"}},[t._v("新增确诊人数")]),t._v(" | "),r("router-link",{attrs:{to:"/TotalDeath"}},[t._v("累计死亡人数")])],1),r("div",{staticClass:"chart",attrs:{id:"chart"}})])},S=[],W={data:function(){return{}},props:{msg:{type:Object,default:function(){}}},watch:{msg:{deep:!0,handler:function(t){this.getWorld(t)}}},mounted:function(){this.getWorld(this.msg)},methods:{getWorld:function(t){var e=this;p.a.get("http://68.79.51.139:8888/echart/totalDeaths").then((function(t){console.log(t);var r=t.data;e.drawChart(r)}))},drawChart:function(t){var e=v.a.init(document.getElementById("chart"));window.addEventListener("resize",(function(){e.resize()})),e.setOption({grid:{width:"100%",height:"100%",left:"0%",right:"0%",bottom:"0%",containLabel:!0},tooltip:{trigger:"item",formatter:function(t){if(null!=t.data)return t.data.name+": "+t.data.value}},visualMap:{min:0,max:15e4,text:["max","min"],realtime:!1,calculable:!0,color:["#ff0000","#ffffff"]},series:[{type:"map",name:"世界地图",mapType:"world",roam:!1,label:{show:!1},zoom:1.2,itemStyle:{borderWidth:.5,borderColor:"#000",borderType:"solid"},emphasis:{label:{show:!0,color:"auto"},itemStyle:{areaColor:"#476fff"}},data:t}]})}}},E=W,z=(r("c20a"),Object(i["a"])(E,k,S,!1,null,"2de61dea",null)),M=z.exports;a["default"].use(s["a"]);var P=[{path:"/",name:"TotalConfirmed",component:y},{path:"/NewConfirmed",name:"NewConfirmed",component:T},{path:"/TotalDeath",name:"TotalDeath",component:M}],D=new s["a"]({mode:"history",base:"/",routes:P}),L=D,N=r("2f62");a["default"].use(N["a"]);var $=new N["a"].Store({state:{},mutations:{},actions:{},modules:{}}),B=(r("c54d"),r("5c96")),I=r.n(B);r("0fae");a["default"].use(I.a),a["default"].config.productionTip=!1,new a["default"]({router:L,store:$,render:function(t){return t(d)}}).$mount("#app")},"6e3e":function(t,e,r){},"7a88":function(t,e,r){},"85ec":function(t,e,r){},c20a:function(t,e,r){"use strict";var a=r("d97d"),n=r.n(a);n.a},d97d:function(t,e,r){},dd6c:function(t,e,r){"use strict";var a=r("7a88"),n=r.n(a);n.a},e0db:function(t,e,r){"use strict";var a=r("6e3e"),n=r.n(a);n.a}});
//# sourceMappingURL=app.13af886a.js.map