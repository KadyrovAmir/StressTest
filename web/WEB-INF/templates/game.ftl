<#ftl encoding="utf-8"/>
<#macro head>
<title>${game.name}</title>
</#macro>
<#macro page>
<div class="heading col-md-offset-2 col-lg-6">
    <h1>${game.name}</h1>
</div>
<div class="video">
    <div class="col-lg-7">
        <p class="img"><img class="img-responsive img-rounded"
                            src='${game.imageURL}'
                            alt="Game image"></p>
    </div>
    <div class="video-game col-lg-4 ">
        <h3 class="date">Дата выхода: ${game.date}</h3>
        <h3 class="rating">Рейтинг: ${game.rating}</h3>
    </div>
</div>
<div class="video-description col-lg-12 text-justify">
    <p>${game.description}</p>
</div>
</#macro>
<#include "base.ftl">