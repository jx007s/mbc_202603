<template>
    <div>
        <h3>StyleChildGo</h3>
        <div class="ggg">
            자식 임포트 스타일 -ggg (css파일 import)
            <br/>
            부모 스타일 적용 O
        </div>

        <div class="aaa">
            자식 임포트 전역 스타일- aaa(style)
            <br/>
            부모 스타일 적용 O
        </div>
        <div class="ccc">
            자식 임포트 지역 스타일- ccc(style)
            <br/>
            부모 스타일 적용 X
        </div>
        <div class="ddd">
            자식 임포트 지역 스타일- ddd(style)
            <br/>
            부모 스타일 적용 O
        </div>
    </div>
</template>
<script setup></script>