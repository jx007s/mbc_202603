<template>
    <div>
        <h3>home</h3>
        <router-link to="/">home</router-link>
        <router-link to="/about">about1</router-link>
        <router-link to="/about?page=2&cate=gall#pp2">about2</router-link>
        <router-link :to="{name:'aboutttt'}">about3</router-link>
        <!-- :to="{name:'aboutttt'}" 라우팅 설정 시 name 값으로 이동-->
        
        <h3>user</h3>
        <!--'/user/:service/:id'-->
        <!-- /user?....   depth 가 맞지 않음 -->
        <router-link to="/user?page=2&cate=gall#pp2">user1</router-link>
        <router-link to="/user/detail/10?page=2&cate=gall#pp2">user2</router-link>
        <h3>dashboard</h3>
        <router-link to="/dashboard/main">main</router-link>
        <router-link to="/dashboard/member">member</router-link>
        <h3>중첩</h3>
        <router-link to="/notice">공지사항</router-link>
    </div>
</template>