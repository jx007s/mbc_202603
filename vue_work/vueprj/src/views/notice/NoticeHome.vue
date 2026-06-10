<template>
    <div>
        <h2>공지사항 홈</h2>
        <NAV>
            <router-link to="/notice">홈</router-link>
            <router-link to="/notice/detail">상세</router-link>
            <router-link to="/notice/write">쓰기</router-link>
        </NAV>
        <!-- 중첩 라우트의 자식 라우트 위치-->
        <router-view/>
    </div>
</template>