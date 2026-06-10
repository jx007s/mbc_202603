<template>
    <div>
        <router-link to="/">home</router-link>
        <router-link to="/about">about</router-link>
        <router-link to="/about?page=2&cate=gall#pp2">about</router-link>
        <br/>
        <!--'/user/:service/:id'-->
        <!-- /user?....   depth 가 맞지 않음 -->
        <router-link to="/user?page=2&cate=gall#pp2">user1</router-link>
        <router-link to="/user/detail/10?page=2&cate=gall#pp2">user2</router-link>
    </div>
</template>