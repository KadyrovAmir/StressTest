<#ftl encoding="utf-8"/>
<#macro head>
    <title>Video</title>
</#macro>
<#macro page>
    <div class="heading col-md-offset-2 col-lg-6">
        <h1>${video.title}</h1>
    </div>
    <div class="video">
        <div class="col-lg-7">
            <iframe width="600" height="370" src='${video.videoLink}' frameborder="0"
                    allowfullscreen></iframe>
        </div>
        <div class="video-game col-lg-4 ">
            <h3>${video.game.name}</h3>
            <p><small>${video.game.description}</small></p>
        </div>
    </div>
    <div class="date col-lg-12">
        <p>${video.date}</p>
    </div>
</#macro>
<#include "base.ftl">
