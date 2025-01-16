<template>
  <div>
    <div>Bot name: {{ bot_name }}</div>
    <div>Bot version: {{ bot_version }}</div>
  </div>
  <router-view/>
</template>

<script>
import $ from 'jquery';
import { ref } from 'vue';

export default {
  name: "App",
  setup: () => {
    let bot_name = ref("");
    let bot_version = ref("");

    $.ajax({
      url: "http://127.0.0.1:3000/pk/getbotinfo/",
      type: "get",
      success: resp => {
        bot_name.value = resp.botName;
        bot_version.value = resp.botVersion;
      }
    });

    return {
      bot_name,
      bot_version
    }
  }
}
</script>

<style>
body {
  background-image: url("@/assets/KamisatoAyakaBackground.png");
  background-size: cover;
}
</style>
