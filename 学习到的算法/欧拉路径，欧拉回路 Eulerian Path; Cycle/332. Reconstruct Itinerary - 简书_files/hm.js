(function(){var h={},mt={},c={id:"0c0e9d9b1e7d617b3e6842e85b9fb068",dm:["jianshu.com"],js:"tongji.baidu.com/hm-web/js/",etrk:[],cetrk:[],icon:'',ctrk:false,align:-1,nv:-1,vdur:1800000,age:31536000000,rec:0,rp:[],trust:0,vcard:0,qiao:0,lxb:0,kbtrk:1,pt:0,spa:0,aet:'',hca:'881F0068C684D06F',conv:0,med:0,cvcc:'',cvcf:[],apps:''};var s=void 0,t=!0,u=null,w=!1;mt.cookie={};mt.cookie.set=function(b,a,f){var d;f.J&&(d=new Date,d.setTime(d.getTime()+f.J));document.cookie=b+"="+a+(f.domain?"; domain="+f.domain:"")+(f.path?"; path="+f.path:"")+(d?"; expires="+d.toGMTString():"")+(f.Zb?"; secure":"")};mt.cookie.get=function(b){return(b=RegExp("(^| )"+b+"=([^;]*)(;|$)").exec(document.cookie))?b[2]:u};
mt.cookie.wb=function(b,a){try{var f="Hm_ck_"+ +new Date;mt.cookie.set(f,"is-cookie-enabled",{domain:b,path:a,J:s});var d="is-cookie-enabled"===mt.cookie.get(f)?"1":"0";mt.cookie.set(f,"",{domain:b,path:a,J:-1});return d}catch(g){return"0"}};mt.lang={};mt.lang.e=function(b,a){return"[object "+a+"]"==={}.toString.call(b)};mt.lang.Da=function(b){return mt.lang.e(b,"Number")&&isFinite(b)};mt.lang.ia=function(){return mt.lang.e(c.aet,"String")};
mt.lang.h=function(b){return b.replace?b.replace(/'/g,"'0").replace(/\*/g,"'1").replace(/!/g,"'2"):b};mt.lang.trim=function(b){return b.replace(/^\s+|\s+$/g,"")};mt.lang.H=function(b,a){var f=w;if(b==u||!mt.lang.e(b,"Array")||a===s)return f;if(Array.prototype.indexOf)f=-1!==b.indexOf(a);else for(var d=0;d<b.length;d++)if(b[d]===a){f=t;break}return f};
(function(){var b=mt.lang;mt.f={};mt.f.xa=function(a){return document.getElementById(a)};mt.f.cb=function(a){if(!a)return u;try{for(var b=a.split(">"),d=document.body,g=b.length-1;0<=g;g--)if(-1<b[g].indexOf("#")){var e=b[g].split("#")[1];(d=document.getElementById(e))||(d=document.getElementById(decodeURIComponent(e)));b=b.splice(g+1,b.length-(g+1));break}for(a=0;d&&a<b.length;){var m=String(b[a]).toLowerCase();if(!("html"===m||"body"===m)){var g=0,p=b[a].match(/\[(\d+)\]/i),e=[];if(p)g=p[1]-1,m=
m.split("[")[0];else if(1!==d.childNodes.length){for(var n=0,x=0,l=d.childNodes.length;x<l;x++){var k=d.childNodes[x];1===k.nodeType&&k.nodeName.toLowerCase()===m&&n++;if(1<n)return u}if(1!==n)return u}for(n=0;n<d.childNodes.length;n++)1===d.childNodes[n].nodeType&&d.childNodes[n].nodeName.toLowerCase()===m&&e.push(d.childNodes[n]);if(!e[g])return u;d=e[g]}a++}return d}catch(r){return u}};mt.f.ga=function(a,b){var d=[],g=[];if(!a)return g;for(;a.parentNode!=u;){for(var e=0,m=0,p=a.parentNode.childNodes.length,
n=0;n<p;n++){var x=a.parentNode.childNodes[n];if(x.nodeName===a.nodeName&&(e++,x===a&&(m=e),0<m&&1<e))break}if((p=""!==a.id)&&b){d.unshift("#"+encodeURIComponent(a.id));break}else p&&(p="#"+encodeURIComponent(a.id),p=0<d.length?p+">"+d.join(">"):p,g.push(p)),d.unshift(encodeURIComponent(String(a.nodeName).toLowerCase())+(1<e?"["+m+"]":""));a=a.parentNode}g.push(d.join(">"));return g};mt.f.ib=function(a){return(a=mt.f.ga(a,t))&&a.length?String(a[0]):""};mt.f.hb=function(a){return mt.f.ga(a,w)};mt.f.Tb=
function(a,b){for(b=b.toUpperCase();(a=a.parentNode)&&1==a.nodeType;)if(a.tagName==b)return a;return u};mt.f.bb=function(a){return 9===a.nodeType?a:a.ownerDocument||a.document};mt.f.Ub=function(a){var b={top:0,left:0};if(!a)return b;var d=mt.f.bb(a).documentElement;"undefined"!==typeof a.getBoundingClientRect&&(b=a.getBoundingClientRect());return{top:b.top+(window.pageYOffset||d.scrollTop)-(d.clientTop||0),left:b.left+(window.pageXOffset||d.scrollLeft)-(d.clientLeft||0)}};mt.f.getAttribute=function(a,
b){var d=a.getAttribute&&a.getAttribute(b)||u;if(!d&&a.attributes&&a.attributes.length)for(var g=a.attributes,e=g.length,m=0;m<e;m++)g[m].nodeName===b&&(d=g[m].nodeValue);return d};mt.f.R=function(a){var b="document";a.tagName!==s&&(b=a.tagName);return b.toLowerCase()};mt.f.lb=function(a){var f="";a.textContent?f=b.trim(a.textContent):a.innerText&&(f=b.trim(a.innerText));f&&(f=f.replace(/\s+/g," ").substring(0,255));return f};mt.f.ya=function(a,b){var d=mt.f.R(a);"input"===d&&b&&("button"===a.type||
"submit"===a.type)?d=a.value||"":"input"===d&&!b&&"password"!==a.type?d=a.value||"":"img"===d?(d=mt.f.getAttribute,d=d(a,"alt")||d(a,"title")||d(a,"src")):d="body"===d||"html"===d?["(hm-default-content-for-",d,")"].join(""):mt.f.lb(a);return String(d).substring(0,255)};(function(){(mt.f.zb=function(){function a(){if(!a.U){a.U=t;for(var d=0,b=g.length;d<b;d++)g[d]()}}function b(){try{document.documentElement.doScroll("left")}catch(d){setTimeout(b,1);return}a()}var d=w,g=[],e;document.addEventListener?
e=function(){document.removeEventListener("DOMContentLoaded",e,w);a()}:document.attachEvent&&(e=function(){"complete"===document.readyState&&(document.detachEvent("onreadystatechange",e),a())});(function(){if(!d)if(d=t,"complete"===document.readyState)a.U=t;else if(document.addEventListener)document.addEventListener("DOMContentLoaded",e,w),window.addEventListener("load",a,w);else if(document.attachEvent){document.attachEvent("onreadystatechange",e);window.attachEvent("onload",a);var g=w;try{g=window.frameElement==
u}catch(p){}document.documentElement.doScroll&&g&&b()}})();return function(d){a.U?d():g.push(d)}}()).U=w})();return mt.f})();mt.event={};mt.event.d=function(b,a,f){b.attachEvent?b.attachEvent("on"+a,function(a){f.call(b,a)}):b.addEventListener&&b.addEventListener(a,f,w)};mt.event.preventDefault=function(b){b.preventDefault?b.preventDefault():b.returnValue=w};
(function(){var b=mt.event;mt.i={};mt.i.Ca=/msie (\d+\.\d+)/i.test(navigator.userAgent);mt.i.ub=/msie (\d+\.\d+)/i.test(navigator.userAgent)?document.documentMode||+RegExp.$1:s;mt.i.cookieEnabled=navigator.cookieEnabled;mt.i.javaEnabled=navigator.javaEnabled();mt.i.language=navigator.language||navigator.browserLanguage||navigator.systemLanguage||navigator.userLanguage||"";mt.i.Cb=(window.screen.width||0)+"x"+(window.screen.height||0);mt.i.colorDepth=window.screen.colorDepth||0;mt.i.S=function(){var a;
a=a||document;return parseInt(window.pageYOffset||a.documentElement.scrollTop||a.body&&a.body.scrollTop||0,10)};mt.i.L=function(){var a=document;return parseInt(window.innerHeight||a.documentElement.clientHeight||a.body&&a.body.clientHeight||0,10)};mt.i.orientation=0;(function(){function a(){var a=0;window.orientation!==s&&(a=window.orientation);screen&&(screen.orientation&&screen.orientation.angle!==s)&&(a=screen.orientation.angle);mt.i.orientation=a}a();b.d(window,"orientationchange",a)})();return mt.i})();
mt.o={};mt.o.parse=function(b){return(new Function("return ("+b+")"))()};
mt.o.stringify=function(){function b(a){/["\\\x00-\x1f]/.test(a)&&(a=a.replace(/["\\\x00-\x1f]/g,function(a){var d=f[a];if(d)return d;d=a.charCodeAt();return"\\u00"+Math.floor(d/16).toString(16)+(d%16).toString(16)}));return'"'+a+'"'}function a(a){return 10>a?"0"+a:a}var f={"\b":"\\b","\t":"\\t","\n":"\\n","\f":"\\f","\r":"\\r",'"':'\\"',"\\":"\\\\"};return function(d){switch(typeof d){case "undefined":return"undefined";case "number":return isFinite(d)?String(d):"null";case "string":return b(d);case "boolean":return String(d);
default:if(d===u)return"null";if(d instanceof Array){var g=["["],e=d.length,m,f,n;for(f=0;f<e;f++)switch(n=d[f],typeof n){case "undefined":case "function":case "unknown":break;default:m&&g.push(","),g.push(mt.o.stringify(n)),m=1}g.push("]");return g.join("")}if(d instanceof Date)return'"'+d.getFullYear()+"-"+a(d.getMonth()+1)+"-"+a(d.getDate())+"T"+a(d.getHours())+":"+a(d.getMinutes())+":"+a(d.getSeconds())+'"';m=["{"];f=mt.o.stringify;for(e in d)if(Object.prototype.hasOwnProperty.call(d,e))switch(n=
d[e],typeof n){case "undefined":case "unknown":case "function":break;default:g&&m.push(","),g=1,m.push(f(e)+":"+f(n))}m.push("}");return m.join("")}}}();mt.localStorage={};mt.localStorage.Y=function(){if(!mt.localStorage.l)try{mt.localStorage.l=document.createElement("input"),mt.localStorage.l.type="hidden",mt.localStorage.l.style.display="none",mt.localStorage.l.addBehavior("#default#userData"),document.getElementsByTagName("head")[0].appendChild(mt.localStorage.l)}catch(b){return w}return t};
mt.localStorage.set=function(b,a,f){var d=new Date;d.setTime(d.getTime()+f||31536E6);try{window.localStorage?(a=d.getTime()+"|"+a,window.localStorage.setItem(b,a)):mt.localStorage.Y()&&(mt.localStorage.l.expires=d.toUTCString(),mt.localStorage.l.load(document.location.hostname),mt.localStorage.l.setAttribute(b,a),mt.localStorage.l.save(document.location.hostname))}catch(g){}};
mt.localStorage.get=function(b){if(window.localStorage){if(b=window.localStorage.getItem(b)){var a=b.indexOf("|"),f=b.substring(0,a)-0;if(f&&f>(new Date).getTime())return b.substring(a+1)}}else if(mt.localStorage.Y())try{return mt.localStorage.l.load(document.location.hostname),mt.localStorage.l.getAttribute(b)}catch(d){}return u};
mt.localStorage.remove=function(b){if(window.localStorage)window.localStorage.removeItem(b);else if(mt.localStorage.Y())try{mt.localStorage.l.load(document.location.hostname),mt.localStorage.l.removeAttribute(b),mt.localStorage.l.save(document.location.hostname)}catch(a){}};mt.sessionStorage={};mt.sessionStorage.set=function(b,a){try{window.sessionStorage&&window.sessionStorage.setItem(b,a)}catch(f){}};
mt.sessionStorage.get=function(b){try{return window.sessionStorage?window.sessionStorage.getItem(b):u}catch(a){return u}};mt.sessionStorage.remove=function(b){try{window.sessionStorage&&window.sessionStorage.removeItem(b)}catch(a){}};mt.Ka={};mt.Ka.log=function(b,a){var f=new Image,d="mini_tangram_log_"+Math.floor(2147483648*Math.random()).toString(36);window[d]=f;f.onload=function(){f.onload=u;f=window[d]=u;a&&a(b)};f.src=b};mt.oa={};
mt.oa.mb=function(){var b="";if(navigator.plugins&&navigator.mimeTypes.length){var a=navigator.plugins["Shockwave Flash"];a&&a.description&&(b=a.description.replace(/^.*\s+(\S+)\s+\S+$/,"$1"))}else if(window.ActiveXObject)try{if(a=new ActiveXObject("ShockwaveFlash.ShockwaveFlash"))(b=a.GetVariable("$version"))&&(b=b.replace(/^.*\s+(\d+),(\d+).*$/,"$1.$2"))}catch(f){}return b};
mt.oa.Sb=function(b,a,f,d,g){return'<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" id="'+b+'" width="'+f+'" height="'+d+'"><param name="movie" value="'+a+'" /><param name="flashvars" value="'+(g||"")+'" /><param name="allowscriptaccess" value="always" /><embed type="application/x-shockwave-flash" name="'+b+'" width="'+f+'" height="'+d+'" src="'+a+'" flashvars="'+(g||"")+'" allowscriptaccess="always" /></object>'};mt.url={};
mt.url.m=function(b,a){var f=b.match(RegExp("(^|&|\\?|#)("+a+")=([^&#]*)(&|$|#)",""));return f?f[3]:u};mt.url.Vb=function(b){return(b=b.match(/^(https?:)\/\//))?b[1]:u};mt.url.fb=function(b){return(b=b.match(/^(https?:\/\/)?([^\/\?#]*)/))?b[2].replace(/.*@/,""):u};mt.url.K=function(b){return(b=mt.url.fb(b))?b.replace(/:\d+$/,""):b};mt.url.ga=function(b){return(b=b.match(/^(https?:\/\/)?[^\/]*(.*)/))?b[2].replace(/[\?#].*/,"").replace(/^$/,"/"):u};
(function(){function b(){for(var a=w,b=document.getElementsByTagName("script"),d=b.length,d=100<d?100:d,g=0;g<d;g++){var e=b[g].src;if(e&&0===e.indexOf("https://hm.baidu.com/h")){a=t;break}}return a}return h.ab=b})();var A=h.ab;
h.z={Wb:"http://tongji.baidu.com/hm-web/welcome/ico",Ha:"hm.baidu.com/hm.gif",Ra:/^(tongji|hmcdn).baidu.com$/,Ma:"tongji.baidu.com",qb:"hmmd",rb:"hmpl",Mb:"utm_medium",pb:"hmkw",Ob:"utm_term",nb:"hmci",Lb:"utm_content",tb:"hmsr",Nb:"utm_source",ob:"hmcu",Kb:"utm_campaign",I:0,D:Math.round(+new Date/1E3),protocol:"https:"===document.location.protocol?"https:":"http:",la:A()||"https:"===document.location.protocol?"https:":"http:",Xb:0,Qb:6E5,xb:6E5,Yb:5E3,Rb:5,ba:1024,Pb:1,V:2147483647,La:"hca kb cc cf ci ck cl cm cp cu cw ds vl ep et fl ja ln lo lt rnd si su v cv lv api sn ct u tt hh".split(" "),
M:t,ua:["a","input","button"],Ta:{id:"data-hm-id",aa:"data-hm-class",ra:"data-hm-xpath",content:"data-hm-content",pa:"data-hm-tag",link:"data-hm-link"},ta:"data-hm-enabled",sa:"data-hm-disabled",yb:"https://hmcdn.baidu.com/static/tongji/plugins/",Ga:["UrlChangeTracker"]};(function(){var b={A:{},d:function(a,b){this.A[a]=this.A[a]||[];this.A[a].push(b)},F:function(a,b){this.A[a]=this.A[a]||[];for(var d=this.A[a].length,g=0;g<d;g++)this.A[a][g](b)}};return h.G=b})();
(function(){function b(b,d){var g=document.createElement("script");g.charset="utf-8";a.e(d,"Function")&&(g.readyState?g.onreadystatechange=function(){if("loaded"===g.readyState||"complete"===g.readyState)g.onreadystatechange=u,d()}:g.onload=function(){d()});g.src=b;var e=document.getElementsByTagName("script")[0];e.parentNode.insertBefore(g,e)}var a=mt.lang;return h.load=b})();
(function(){var b=mt.lang,a=mt.f,f={P:function(b,g){return function(e){var m=e.target||e.srcElement;if(m){var p=m.getAttribute(b.X);e=e.clientX+":"+e.clientY;if(p&&p===e)m.removeAttribute(b.X);else if(g&&0<g.length&&(m=a.hb(m))&&m.length)if(p=m.length,e=m[m.length-1],1E4>p*e.split(">").length)for(e=0;e<p;e++)f.Ja(b,m[e]);else f.Ja(b,e)}}},Ja:function(a,g){for(var e={},m=String(g).split(">").length,f=0;f<m;f++)e[g]="",g=g.substring(0,g.lastIndexOf(">"));a&&(b.e(a,"Object")&&a.va)&&a.va(e)},Ab:function(a,
b){return function(e){(e.target||e.srcElement).setAttribute(a.X,e.clientX+":"+e.clientY);a&&a.r&&(b?a.r(b):a.r("#"+encodeURIComponent(this.id),e.type))}}};return h.da=f})();
(function(){var b=mt.f,a=mt.o,f=mt.event,d=mt.lang,g=h.da,e={X:"HM_ce",Na:function(){if(c.cetrk&&c.cetrk.length){f.d(document,"click",g.P(e,c.cetrk));for(var d=0,p=c.cetrk.length;d<p;d++){var n;try{n=a.parse(decodeURIComponent(String(c.cetrk[d])))}catch(x){n={}}var l=n.p||"";-1===l.indexOf(">")&&(0===l.indexOf("#")&&(l=l.substring(1)),(l=b.xa(l))&&f.d(l,"click",g.Ab(e,n)))}}},va:function(b){if(c.cetrk&&c.cetrk.length)for(var d=0,g=c.cetrk.length;d<g;d++){var f;try{f=a.parse(decodeURIComponent(String(c.cetrk[d])))}catch(l){f=
{}}b.hasOwnProperty(f.p)&&e.r(f)}},r:function(a){h.c.b.et=7;var g=a&&a.k||"",g=d.h(g),e=[];if(a&&a.a&&d.e(a.a,"Object"))for(var f in a.a)if(a.a.hasOwnProperty(f)){e.push(d.h(f));var l=b.cb(a.a[f]||""),l=l?b.ya(l,w):"";e.push(d.h(l))}a="";e.length&&(a="*"+e.join("*"));h.c.b.ep="ce!_iden*"+g+a;h.c.j()}};h.G.d("pv-b",e.Na);return e})();
(function(){var b=mt.lang,a=mt.f,f=mt.event,d=mt.i,g=h.z,e=h.G,m=+new Date,p=[],n={P:function(){return function(d){if(h.c&&h.c.M&&c.aet&&c.aet.length){var e=d.target||d.srcElement;if(e){var k=h.c.ua,r=a.getAttribute(e,g.ta)!=u?t:w;if(a.getAttribute(e,g.sa)==u)if(r)n.Z(n.fa(e,d));else{var f=a.R(e);if(b.H(k,"*")||b.H(k,f))n.Z(n.fa(e,d));else for(;e.parentNode!=u;){var r=e.parentNode,f=a.R(r),q="a"===f&&b.H(k,"a")?t:w,f="button"===f&&b.H(k,"button")?t:w,v=a.getAttribute(r,g.ta)!=u?t:w;if(a.getAttribute(r,
g.sa)==u&&(q||f||v)){n.Z(n.fa(r,d));break}e=e.parentNode}}}}}},fa:function(e,f){var k={},r=g.Ta;k.id=a.getAttribute(e,r.id)||a.getAttribute(e,"id")||"";k.aa=a.getAttribute(e,r.aa)||a.getAttribute(e,"class")||"";k.ra=a.getAttribute(e,r.ra)||a.ib(e);k.content=a.getAttribute(e,r.content)||a.ya(e,t);k.pa=a.getAttribute(e,r.pa)||a.R(e);k.link=a.getAttribute(e,r.link)||a.getAttribute(e,"href")||"";k.type=f.type||"click";r=b.Da(e.offsetTop)?e.offsetTop:0;"click"===f.type?r=d.Ca?f.clientY+Math.max(document.documentElement.scrollTop,
document.body.scrollTop):f.pageY:"touchend"===f.type&&(f.ma&&b.e(f.ma.changedTouches,"Array")&&f.ma.changedTouches.length)&&(r=f.ma.changedTouches[0].pageY);k.Jb=r;return k},Z:function(a){var d=b.h;a=[+new Date-(h.c.B!==s?h.c.B:m),d(a.id),d(a.aa),d(a.pa),d(a.ra),d(a.link),d(a.content),a.type,a.Jb].join("*");n.$(a);b.e(this.O(),"Function")&&this.O()()},$:function(a){a.length>g.ba||(encodeURIComponent(p.join("!")+a).length>g.ba&&(n.r(p.join("!")),p=[]),p.push(a))},r:function(a){h.c.b.et=5;h.c.b.ep=
a;h.c.j()},O:function(){return function(){p&&p.length&&(n.r(p.join("!")),p=[])}}};b.ia()&&""!==c.aet&&e.d("pv-b",function(){f.d(document,"click",n.P());"ontouchend"in document&&f.d(window,"touchend",n.P());f.d(window,"unload",n.O())});return n})();
(function(){var b=mt.event,a=mt.i,f=h.z,d=h.G,g=+new Date,e=[],m=u,p={Ya:function(){return function(){h.c&&(h.c.M&&c.aet&&c.aet.length)&&(window.clearTimeout(m),m=window.setTimeout(function(){p.Pa(a.S()+a.L())},150))}},Pa:function(a){p.$([+new Date-(h.c.B!==s?h.c.B:g),a].join("*"))},$:function(a){if(encodeURIComponent(e.join("!")+a).length>f.ba||3<e.length)p.r(e.join("!")),e=[];e.push(a)},r:function(b){h.c.b.et=6;h.c.b.vh=a.L();h.c.b.ep=b;h.c.j()},O:function(){return function(){e&&e.length&&(p.r(e.join("!")),
e=[])}}};mt.lang.ia()&&""!==c.aet&&d.d("pv-b",function(){b.d(window,"scroll",p.Ya());b.d(window,"unload",p.O())});return p})();
(function(){function b(){return function(){h.c.b.nv=0;h.c.b.st=4;h.c.b.et=3;h.c.b.ep=h.ca.gb()+","+h.ca.eb();h.c.j()}}function a(){clearTimeout(z);var b;q&&(b="visible"==document[q]);v&&(b=!document[v]);p="undefined"==typeof b?t:b;if((!m||!n)&&p&&x)y=t,k=+new Date;else if(m&&n&&(!p||!x))y=w,r+=+new Date-k;m=p;n=x;z=setTimeout(a,100)}function f(a){var k=document,b="";if(a in k)b=a;else for(var d=["webkit","ms","moz","o"],q=0;q<d.length;q++){var v=d[q]+a.charAt(0).toUpperCase()+a.slice(1);if(v in k){b=
v;break}}return b}function d(k){if(!("focus"==k.type||"blur"==k.type)||!(k.target&&k.target!=window))x="focus"==k.type||"focusin"==k.type?t:w,a()}var g=mt.event,e=h.G,m=t,p=t,n=t,x=t,l=+new Date,k=l,r=0,y=t,q=f("visibilityState"),v=f("hidden"),z;a();(function(){var k=q.replace(/[vV]isibilityState/,"visibilitychange");g.d(document,k,a);g.d(window,"pageshow",a);g.d(window,"pagehide",a);"object"==typeof document.onfocusin?(g.d(document,"focusin",d),g.d(document,"focusout",d)):(g.d(window,"focus",d),
g.d(window,"blur",d))})();h.ca={gb:function(){return+new Date-l},eb:function(){return y?+new Date-k+r:r}};e.d("pv-b",function(){g.d(window,"unload",b())});e.d("duration-send",b());e.d("duration-done",function(){k=l=+new Date;r=0});return h.ca})();
(function(){var b=mt.lang,a=h.z,f=h.load,d={vb:function(d){if((window._dxt===s||b.e(window._dxt,"Array"))&&"undefined"!==typeof h.c){var e=h.c.Q();f([a.protocol,"//datax.baidu.com/x.js?si=",c.id,"&dm=",encodeURIComponent(e)].join(""),d)}},Ib:function(a){if(b.e(a,"String")||b.e(a,"Number"))window._dxt=window._dxt||[],window._dxt.push(["_setUserId",a])}};return h.Wa=d})();
(function(){function b(a,b,d,q){if(!(a===s||b===s||q===s)){if(""===a)return[b,d,q].join("*");a=String(a).split("!");for(var v,e=w,f=0;f<a.length;f++)if(v=a[f].split("*"),String(b)===v[0]){v[1]=d;v[2]=q;a[f]=v.join("*");e=t;break}e||a.push([b,d,q].join("*"));return a.join("!")}}function a(k){for(var b in k)if({}.hasOwnProperty.call(k,b)){var e=k[b];d.e(e,"Object")||d.e(e,"Array")?a(e):k[b]=String(e)}}var f=mt.url,d=mt.lang,g=mt.o,e=mt.i,m=h.z,p=h.G,n=h.Wa,x=h.load,l={N:[],W:0,Ea:w,w:{qa:"",page:""},
init:function(){l.g=0;p.d("pv-b",function(){l.Xa();l.Za()});p.d("pv-d",function(){l.$a();l.w.page=""});p.d("stag-b",function(){h.c.b.api=l.g||l.W?l.g+"_"+l.W:"";h.c.b.ct=[decodeURIComponent(h.c.getData("Hm_ct_"+c.id)||""),l.w.qa,l.w.page].join("!")});p.d("stag-d",function(){h.c.b.api=0;l.g=0;l.W=0})},Xa:function(){var a=window._hmt||[];if(!a||d.e(a,"Array"))window._hmt={id:c.id,cmd:{},push:function(){for(var a=window._hmt,k=0;k<arguments.length;k++){var b=arguments[k];d.e(b,"Array")&&(a.cmd[a.id].push(b),
"_setAccount"===b[0]&&(1<b.length&&/^[0-9a-f]{32}$/.test(b[1]))&&(b=b[1],a.id=b,a.cmd[b]=a.cmd[b]||[]))}}},window._hmt.cmd[c.id]=[],window._hmt.push.apply(window._hmt,a)},Za:function(){var a=window._hmt;if(a&&a.cmd&&a.cmd[c.id])for(var b=a.cmd[c.id],d=/^_track(Event|MobConv|Order|RTEvent)$/,q=0,v=b.length;q<v;q++){var e=b[q];d.test(e[0])?l.N.push(e):l.na(e)}a.cmd[c.id]={push:l.na}},$a:function(){if(0<l.N.length)for(var a=0,b=l.N.length;a<b;a++)l.na(l.N[a]);l.N=u},na:function(a){var b=a[0];if(l.hasOwnProperty(b)&&
d.e(l[b],"Function"))l[b](a)},_setAccount:function(a){1<a.length&&/^[0-9a-f]{32}$/.test(a[1])&&(l.g|=1)},_setAutoPageview:function(a){if(1<a.length&&(a=a[1],w===a||t===a))l.g|=2,h.c.Aa=a},_trackPageview:function(a){if(1<a.length&&a[1].charAt&&"/"===a[1].charAt(0)){l.g|=4;h.c.b.sn=h.c.za();h.c.b.et=0;h.c.b.ep="";h.c.b.vl=e.S()+e.L();h.c.b.kb=0;h.c.ha?(h.c.b.nv=0,h.c.b.st=4):h.c.ha=t;var b=h.c.b.u,d=h.c.b.su;h.c.b.u=m.protocol+"//"+document.location.host+a[1];l.Ea||(h.c.b.su=document.location.href);
h.c.j();h.c.b.u=b;h.c.b.su=d;h.c.B=+new Date}},_trackEvent:function(a){2<a.length&&(l.g|=8,h.c.b.nv=0,h.c.b.st=4,h.c.b.et=4,h.c.b.ep=d.h(a[1])+"*"+d.h(a[2])+(a[3]?"*"+d.h(a[3]):"")+(a[4]?"*"+d.h(a[4]):""),h.c.j())},_setCustomVar:function(a){if(!(4>a.length)){var b=a[1],e=a[4]||3;if(0<b&&6>b&&0<e&&4>e){l.W++;for(var q=(h.c.b.cv||"*").split("!"),v=q.length;v<b-1;v++)q.push("*");q[b-1]=e+"*"+d.h(a[2])+"*"+d.h(a[3]);h.c.b.cv=q.join("!");a=h.c.b.cv.replace(/[^1](\*[^!]*){2}/g,"*").replace(/((^|!)\*)+$/g,
"");""!==a?h.c.setData("Hm_cv_"+c.id,encodeURIComponent(a),c.age):h.c.Bb("Hm_cv_"+c.id)}}},_setUserTag:function(a){if(!(3>a.length)){var e=d.h(a[1]);a=d.h(a[2]);if(e!==s&&a!==s){var f=decodeURIComponent(h.c.getData("Hm_ct_"+c.id)||""),f=b(f,e,1,a);h.c.setData("Hm_ct_"+c.id,encodeURIComponent(f),c.age)}}},_setVisitTag:function(a){if(!(3>a.length)){var e=d.h(a[1]);a=d.h(a[2]);if(e!==s&&a!==s){var f=l.w.qa,f=b(f,e,2,a);l.w.qa=f}}},_setPageTag:function(a){if(!(3>a.length)){var e=d.h(a[1]);a=d.h(a[2]);
if(e!==s&&a!==s){var f=l.w.page,f=b(f,e,3,a);l.w.page=f}}},_setReferrerOverride:function(a){1<a.length&&(h.c.b.su=a[1].charAt&&"/"===a[1].charAt(0)?m.protocol+"//"+window.location.host+a[1]:a[1],l.Ea=t)},_trackOrder:function(b){b=b[1];d.e(b,"Object")&&(a(b),l.g|=16,h.c.b.nv=0,h.c.b.st=4,h.c.b.et=94,h.c.b.ep=g.stringify(b),h.c.j())},_trackMobConv:function(a){if(a={webim:1,tel:2,map:3,sms:4,callback:5,share:6}[a[1]])l.g|=32,h.c.b.et=93,h.c.b.ep=a,h.c.j()},_trackRTPageview:function(b){b=b[1];d.e(b,"Object")&&
(a(b),b=g.stringify(b),512>=encodeURIComponent(b).length&&(l.g|=64,h.c.b.rt=b))},_trackRTEvent:function(b){b=b[1];if(d.e(b,"Object")){a(b);b=encodeURIComponent(g.stringify(b));var e=function(a){var b=h.c.b.rt;l.g|=128;h.c.b.et=90;h.c.b.rt=a;h.c.j();h.c.b.rt=b},f=b.length;if(900>=f)e.call(this,b);else for(var f=Math.ceil(f/900),q="block|"+Math.round(Math.random()*m.V).toString(16)+"|"+f+"|",v=[],z=0;z<f;z++)v.push(z),v.push(b.substring(900*z,900*z+900)),e.call(this,q+v.join("|")),v=[]}},_setUserId:function(a){a=
a[1];n.vb();n.Ib(a)},_setAutoTracking:function(a){if(1<a.length&&(a=a[1],w===a||t===a))h.c.Ba=a},_setAutoEventTracking:function(a){if(1<a.length&&(a=a[1],w===a||t===a))h.c.M=a},_trackPageDuration:function(a){1<a.length?(a=a[1],2===String(a).split(",").length&&(h.c.b.et=3,h.c.b.ep=a,h.c.j())):p.F("duration-send");p.F("duration-done")},_require:function(a){1<a.length&&(a=a[1],m.Ra.test(f.K(a))&&x(a))},_providePlugin:function(a){if(1<a.length){var b=window._hmt,e=a[1];a=a[2];if(d.H(m.Ga,e)&&d.e(a,"Function")&&
(b.plugins=b.plugins||{},b.C=b.C||{},b.plugins[e]=a,b.s=b.s||[],a=b.s.slice(),e&&a.length&&a[0][1]===e))for(var q=0,v=a.length;q<v;q++){var f=a[q][2]||{};if(b.plugins[e]&&!b.C[e])b.C[e]=new b.plugins[e](f),b.s.shift();else break}}},_requirePlugin:function(a){if(1<a.length){var b=window._hmt,e=a[1],q=a[2]||{};if(d.H(m.Ga,e))if(b.plugins=b.plugins||{},b.C=b.C||{},b.plugins[e]&&!b.C[e])b.C[e]=new b.plugins[e](q);else{b.s=b.s||[];for(var q=0,v=b.s.length;q<v;q++)if(b.s[q][1]===e)return;b.s.push(a);l._require([u,
m.yb+e+".js"])}}},_trackCustomEvent:function(a){if(1<a.length){var b=d.h(a[1]),e="";a=a[2];if(d.e(a,"Object")){var e=[],q;for(q in a)a.hasOwnProperty(q)&&(e.push(d.h(q)),e.push(d.h(a[q])));e="*"+e.join("*")}h.c.b.et=7;h.c.b.ep="ce!_iden*"+b+e;h.c.j()}}};l.init();h.Sa=l;return h.Sa})();
(function(){function b(){"undefined"===typeof window["_bdhm_loaded_"+c.id]&&(window["_bdhm_loaded_"+c.id]=t,this.b={},this.Ba=this.Aa=t,this.M=k.M,this.ua=g.ia()&&0<c.aet.length?c.aet.split(","):"",this.ha=w,this.init())}var a=mt.url,f=mt.Ka,d=mt.oa,g=mt.lang,e=mt.cookie,m=mt.i,p=mt.localStorage,n=mt.sessionStorage,x=mt.o,l=mt.event,k=h.z,r=h.load,y=h.G;b.prototype={ka:function(a,b){a="."+a.replace(/:\d+/,"");b="."+b.replace(/:\d+/,"");var d=a.indexOf(b);return-1<d&&d+b.length===a.length},Fa:function(a,
b){a=a.replace(/^https?:\/\//,"");return 0===a.indexOf(b)},T:function(b){for(var d=0;d<c.dm.length;d++)if(-1<c.dm[d].indexOf("/")){if(this.Fa(b,c.dm[d]))return t}else{var e=a.K(b);if(e&&this.ka(e,c.dm[d]))return t}return w},Q:function(){for(var a=document.location.hostname,b=0,d=c.dm.length;b<d;b++)if(this.ka(a,c.dm[b]))return c.dm[b].replace(/(:\d+)?[/?#].*/,"");return a},ea:function(){for(var a=0,b=c.dm.length;a<b;a++){var d=c.dm[a];if(-1<d.indexOf("/")&&this.Fa(document.location.href,d))return d.replace(/^[^/]+(\/.*)/,
"$1")+"/"}return"/"},jb:function(){if(!document.referrer)return k.D-k.I>c.vdur?1:4;var b=w;this.T(document.referrer)&&this.T(document.location.href)?b=t:(b=a.K(document.referrer),b=this.ka(b||"",document.location.hostname));return b?k.D-k.I>c.vdur?1:4:3},getData:function(a){try{return e.get(a)||n.get(a)||p.get(a)}catch(b){}},setData:function(a,b,d){try{e.set(a,b,{domain:this.Q(),path:this.ea(),J:d}),d?p.set(a,b,d):n.set(a,b)}catch(f){}},Bb:function(a){try{e.set(a,"",{domain:this.Q(),path:this.ea(),
J:-1}),n.remove(a),p.remove(a)}catch(b){}},Gb:function(){var a,b,d,f,g;k.I=this.getData("Hm_lpvt_"+c.id)||0;13===k.I.length&&(k.I=Math.round(k.I/1E3));b=this.jb();a=4!==b?1:0;if(d=this.getData("Hm_lvt_"+c.id)){f=d.split(",");for(g=f.length-1;0<=g;g--)13===f[g].length&&(f[g]=""+Math.round(f[g]/1E3));for(;2592E3<k.D-f[0];)f.shift();g=4>f.length?2:3;for(1===a&&f.push(k.D);4<f.length;)f.shift();d=f.join(",");f=f[f.length-1]}else d=k.D,f="",g=1;this.setData("Hm_lvt_"+c.id,d,c.age);this.setData("Hm_lpvt_"+
c.id,k.D);d=e.wb(this.Q(),this.ea());if(0===c.nv&&this.T(document.location.href)&&(""===document.referrer||this.T(document.referrer)))a=0,b=4;this.b.nv=a;this.b.st=b;this.b.cc=d;this.b.lt=f;this.b.lv=g},Fb:function(){for(var a=[],b=this.b.et,d=+new Date,e=0,f=k.La.length;e<f;e++){var g=k.La[e],m=this.b[g];"undefined"!==typeof m&&""!==m&&("tt"!==g||"tt"===g&&0===b)&&(("ct"!==g||"ct"===g&&0===b)&&("kb"!==g||"kb"===g&&3===b))&&a.push(g+"="+encodeURIComponent(m))}switch(b){case 0:this.b.rt&&a.push("rt="+
encodeURIComponent(this.b.rt));break;case 5:a.push("_lpt="+this.B);a.push("_ct="+d);break;case 6:a.push("_lpt="+this.B);a.push("_ct="+d);break;case 90:this.b.rt&&a.push("rt="+this.b.rt)}return a.join("&")},Hb:function(){this.Gb();this.b.si=c.id;this.b.sn=this.za();this.b.su=document.referrer;this.b.hh=window.location.hash;this.b.ds=m.Cb;this.b.cl=m.colorDepth+"-bit";this.b.ln=String(m.language).toLowerCase();this.b.ja=m.javaEnabled?1:0;this.b.ck=m.cookieEnabled?1:0;this.b.lo="number"===typeof _bdhm_top?
1:0;this.b.fl=d.mb();this.b.v="1.2.51";this.b.cv=decodeURIComponent(this.getData("Hm_cv_"+c.id)||"");this.b.tt=document.title||"";this.b.vl=m.S()+m.L();var b=document.location.href;this.b.cm=a.m(b,k.qb)||"";this.b.cp=a.m(b,k.rb)||a.m(b,k.Mb)||"";this.b.cw=a.m(b,k.pb)||a.m(b,k.Ob)||"";this.b.ci=a.m(b,k.nb)||a.m(b,k.Lb)||"";this.b.cf=a.m(b,k.tb)||a.m(b,k.Nb)||"";this.b.cu=a.m(b,k.ob)||a.m(b,k.Kb)||""},init:function(){try{this.Hb(),0===this.b.nv?this.Eb():this.wa(),h.c=this,this.Va(),this.Ua(),y.F("pv-b"),
this.Db()}catch(a){var b=[];b.push("si="+c.id);b.push("n="+encodeURIComponent(a.name));b.push("m="+encodeURIComponent(a.message));b.push("r="+encodeURIComponent(document.referrer));f.log(k.la+"//"+k.Ha+"?"+b.join("&"))}},Db:function(){function a(){y.F("pv-d")}this.Aa?(this.ha=t,this.b.et=0,this.b.ep="",this.b.vl=m.S()+m.L(),this.j(a)):a();this.B=+new Date},j:function(a){if(this.Ba){var b=this;b.b.rnd=Math.round(Math.random()*k.V);y.F("stag-b");var d=k.la+"//"+k.Ha+"?"+b.Fb();y.F("stag-d");b.Qa(d);
f.log(d,function(d){b.Ia(d);g.e(a,"Function")&&a.call(b)})}},Va:function(){var b=document.location.hash.substring(1),d=RegExp(c.id),e=a.K(document.referrer)===k.Ma?1:0,f=a.m(b,"jn"),g=/^heatlink$|^select$|^pageclick$/.test(f);b&&(d.test(b)&&e&&g)&&(this.b.rnd=Math.round(Math.random()*k.V),b=document.createElement("script"),b.setAttribute("type","text/javascript"),b.setAttribute("charset","utf-8"),b.setAttribute("src",k.protocol+"//"+c.js+f+".js?"+this.b.rnd),f=document.getElementsByTagName("script")[0],
f.parentNode.insertBefore(b,f))},Ua:function(){if(window.postMessage&&window.self!==window.parent){var b=this;l.d(window,"message",function(d){if(a.K(d.origin)===k.Ma){var e=d.data||{};d=e.sd||"";var e=e.jn||"",f=/^customevent$/.test(e);RegExp(c.id).test(d)&&f&&(b.b.rnd=Math.round(Math.random()*k.V),r(k.protocol+"//"+c.js+e+".js?"+b.b.rnd))}});window.parent.postMessage({id:c.id,url:document.location.href,status:"__Messenger__hmLoaded"},"*")}},Qa:function(a){var b;try{b=x.parse(n.get("Hm_unsent_"+
c.id)||"[]")}catch(d){b=[]}var e=this.b.u?"":"&u="+encodeURIComponent(document.location.href);b.push(a.replace(/^https?:\/\//,"")+e);n.set("Hm_unsent_"+c.id,x.stringify(b))},Ia:function(a){var b;try{b=x.parse(n.get("Hm_unsent_"+c.id)||"[]")}catch(d){b=[]}if(b.length){a=a.replace(/^https?:\/\//,"");for(var e=0;e<b.length;e++)if(a.replace(/&u=[^&]*/,"")===b[e].replace(/&u=[^&]*/,"")){b.splice(e,1);break}b.length?n.set("Hm_unsent_"+c.id,x.stringify(b)):this.wa()}},wa:function(){n.remove("Hm_unsent_"+
c.id)},Eb:function(){var a=this,b;try{b=x.parse(n.get("Hm_unsent_"+c.id)||"[]")}catch(d){b=[]}if(b.length)for(var e=function(b){f.log(k.la+"//"+b,function(b){a.Ia(b)})},g=0;g<b.length;g++)e(b[g])},za:function(){return Math.round(+new Date/1E3)%65535}};return new b})();
(function(){var b=mt.event,a=mt.lang,f=h.z;if(c.kbtrk&&"undefined"!==typeof h.c){h.c.b.kb=a.Da(h.c.b.kb)?h.c.b.kb:0;var d=function(){h.c.b.et=85;h.c.b.ep=h.c.b.kb;h.c.j()};b.d(document,"keyup",function(){h.c.b.kb++});b.d(window,"unload",function(){d()});setInterval(d,f.xb)}})();var B=h.z,C=h.load;c.pt&&C([B.protocol,"//ada.baidu.com/phone-tracker/insert_bdtj?sid=",c.pt].join(""));
(function(){var b=mt.i,a=mt.lang,f=mt.event,d=mt.o;if("undefined"!==typeof h.c&&(c.med||(!b.Ca||7<b.ub)&&c.cvcc)){var g,e,m,p,n=function(a){if(a.item){for(var b=a.length,d=Array(b);b--;)d[b]=a[b];return d}return[].slice.call(a)},x=function(a,b){for(var d in a)if(a.hasOwnProperty(d)&&b.call(a,d,a[d])===w)return w},l=function(b,e){var f={};f.n=g;f.t="clk";f.v=b;if(e){var k=e.getAttribute("href"),l=e.getAttribute("onclick")?""+e.getAttribute("onclick"):u,n=e.getAttribute("id")||"";m.test(k)?(f.sn="mediate",
f.snv=k):a.e(l,"String")&&m.test(l)&&(f.sn="wrap",f.snv=l);f.id=n}h.c.b.et=86;h.c.b.ep=d.stringify(f);h.c.j();for(f=+new Date;400>=+new Date-f;);};if(c.med)e="/zoosnet",g="swt",m=/swt|zixun|call|chat|zoos|business|talk|kefu|openkf|online|\/LR\/Chatpre\.aspx/i,p={click:function(){for(var a=[],b=n(document.getElementsByTagName("a")),b=[].concat.apply(b,n(document.getElementsByTagName("area"))),b=[].concat.apply(b,n(document.getElementsByTagName("img"))),d,e,f=0,g=b.length;f<g;f++)d=b[f],e=d.getAttribute("onclick"),
d=d.getAttribute("href"),(m.test(e)||m.test(d))&&a.push(b[f]);return a}};else if(c.cvcc){e="/other-comm";g="other";m=c.cvcc.q||s;var k=c.cvcc.id||s;p={click:function(){for(var a=[],b=n(document.getElementsByTagName("a")),b=[].concat.apply(b,n(document.getElementsByTagName("area"))),b=[].concat.apply(b,n(document.getElementsByTagName("img"))),d,e,f,g=0,l=b.length;g<l;g++)d=b[g],m!==s?(e=d.getAttribute("onclick"),f=d.getAttribute("href"),k?(d=d.getAttribute("id"),(m.test(e)||m.test(f)||k.test(d))&&
a.push(b[g])):(m.test(e)||m.test(f))&&a.push(b[g])):k!==s&&(d=d.getAttribute("id"),k.test(d)&&a.push(b[g]));return a}}}if("undefined"!==typeof p&&"undefined"!==typeof m){var r;e+=/\/$/.test(e)?"":"/";var y=function(b,d){if(r===d)return l(e+b,d),w;if(a.e(d,"Array")||a.e(d,"NodeList"))for(var f=0,g=d.length;f<g;f++)if(r===d[f])return l(e+b+"/"+(f+1),d[f]),w};f.d(document,"mousedown",function(b){b=b||window.event;r=b.target||b.srcElement;var d={};for(x(p,function(b,e){d[b]=a.e(e,"Function")?e():document.getElementById(e)});r&&
r!==document&&x(d,y)!==w;)r=r.parentNode})}}})();(function(){var b=mt.f,a=mt.lang,f=mt.event,d=mt.o;if("undefined"!==typeof h.c&&a.e(c.cvcf,"Array")&&0<c.cvcf.length){var g={Oa:function(){for(var a=c.cvcf.length,d,p=0;p<a;p++)(d=b.xa(decodeURIComponent(c.cvcf[p])))&&f.d(d,"click",g.da())},da:function(){return function(){h.c.b.et=86;var a={n:"form",t:"clk"};a.id=this.id;h.c.b.ep=d.stringify(a);h.c.j()}}};b.zb(function(){g.Oa()})}})();
(function(){var b=mt.event,a=mt.o;if(c.med&&"undefined"!==typeof h.c){var f=+new Date,d={n:"anti",sb:0,kb:0,clk:0},g=function(){h.c.b.et=86;h.c.b.ep=a.stringify(d);h.c.j()};b.d(document,"click",function(){d.clk++});b.d(document,"keyup",function(){d.kb=1});b.d(window,"scroll",function(){d.sb++});b.d(window,"unload",function(){d.t=+new Date-f;g()});b.d(window,"load",function(){setTimeout(g,5E3)})}})();c.spa!==s&&"1"===String(c.spa)&&(window._hmt=window._hmt||[],window._hmt.push(["_requirePlugin","UrlChangeTracker"]));})();
